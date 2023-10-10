package com.fdx.api.multitenancy.interceptor;

import com.fdx.api.multitenancy.domain.entity.Developer;
import com.fdx.api.multitenancy.repository.DeveloperRepository;
import com.fdx.common.util.DeveloperContext;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

/**
 * Web request interception.
 */
@Component
public class DeveloperInterceptor implements WebRequestInterceptor {

  private final DeveloperRepository developerRepository;

  @Value("${multitenancy.schema-cache.maximumSize:1000}")
  private Long maximumSize;
  @Value("${multitenancy.schema-cache.expireAfterAccess:10}")
  private Integer expireAfterAccess;

  private LoadingCache<String, String> developerSchemas;

  public DeveloperInterceptor(DeveloperRepository developerRepository) {
    this.developerRepository = developerRepository;
  }

  @PostConstruct
  private void createCache() {
    Caffeine<Object, Object> developersCacheBuilder = Caffeine.newBuilder();
    if (maximumSize != null) {
      developersCacheBuilder.maximumSize(maximumSize);
    }
    if (expireAfterAccess != null) {
      developersCacheBuilder.expireAfterAccess(expireAfterAccess, TimeUnit.MINUTES);
    }
    developerSchemas = developersCacheBuilder.build(
        developerId -> {
          Developer developer = developerRepository.findByDeveloperId(developerId)
              .orElse(new Developer("default", "version"));
          return developer.getTeamId();
        });
  }

  @Override
  public void preHandle(WebRequest request) {
    String requestURI = ((ServletWebRequest) request).getRequest().getRequestURI();
    boolean ignoreDeveloperId = false;
    if (requestURI.contains("/register") || requestURI.contains("/consents")) {
      ignoreDeveloperId = true;
    }
    String developerId;
    String apiVersion = "5.1";
    if (!ignoreDeveloperId && request.getHeader("developer") != null) {
      developerId = request.getHeader("developer");
    } else {
      developerId = "default";
    }
    if (request.getHeader("Api-version") != null) {
      apiVersion = request.getHeader("Api-version");
    }
    String developerSchema = developerSchemas.get(developerId);
    assert(apiVersion!=null);
    DeveloperContext.setDeveloperSchema(developerSchema + apiVersion.replace(".", ""));
  }

  @Override
  public void postHandle(@NonNull WebRequest request, ModelMap model) {
    DeveloperContext.clear();
  }

  @Override
  public void afterCompletion(@NonNull WebRequest request, Exception ex) {
    // NOOP
  }
}
