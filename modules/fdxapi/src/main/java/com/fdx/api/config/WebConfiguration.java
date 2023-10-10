package com.fdx.api.config;

import com.fdx.api.multitenancy.interceptor.DeveloperInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Web configuration for developer schema.
 */
@RequiredArgsConstructor
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    private final DeveloperInterceptor developerInterceptor;

    /**
     * Interceptor registered to apply to all requests.
     *
     * @param registry value
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addWebRequestInterceptor(developerInterceptor);
    }

}