package kemy.dev.InterceptorsExample.configurations;

import kemy.dev.InterceptorsExample.interceptors.APILoggingInterceptor;
import kemy.dev.InterceptorsExample.interceptors.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Component
public class SpringMvcConfiguration implements WebMvcConfigurer {
    @Autowired
    private APILoggingInterceptor apiLoggingInterceptor;
    @Autowired
    private LegacyInterceptor legacyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(apiLoggingInterceptor);
       registry.addInterceptor(legacyInterceptor);
    }
}
