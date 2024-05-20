package com.merakl.mmm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.merakl.mmm.interceptor.LoginInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
//		registry.addInterceptor(new LoginInterceptor())
//		        .excludePathPatterns("/resources/**")
//		        .excludePathPatterns("/login/**")
//		        .excludePathPatterns("/guest/**");
	}
}
