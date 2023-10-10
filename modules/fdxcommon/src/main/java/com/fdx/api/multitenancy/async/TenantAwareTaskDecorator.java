package com.fdx.api.multitenancy.async;

import com.fdx.common.util.DeveloperContext;
import org.springframework.core.task.TaskDecorator;
import org.springframework.lang.NonNull;

/**
 * Decorator for developer specific schema
 */
public class TenantAwareTaskDecorator implements TaskDecorator {

    @Override
    @NonNull
    public Runnable decorate(@NonNull Runnable runnable) {
        String developerSchema = DeveloperContext.getDeveloperSchema();
        return () -> {
            try {
                DeveloperContext.setDeveloperSchema(developerSchema);
                runnable.run();
            } finally {
                DeveloperContext.setDeveloperSchema(null);
            }
        };
    }
}