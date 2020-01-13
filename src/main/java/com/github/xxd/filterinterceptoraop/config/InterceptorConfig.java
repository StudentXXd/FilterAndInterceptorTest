package com.github.xxd.filterinterceptoraop.config;

import com.github.xxd.filterinterceptoraop.interceptor.TestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author xxd
 * @date 2020/1/13 15:07
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private TestInterceptor testInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(testInterceptor).addPathPatterns("/test/**");
    }
}
