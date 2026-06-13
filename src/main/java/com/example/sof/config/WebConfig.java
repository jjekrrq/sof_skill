package com.example.sof.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")                  // /api 로 시작하는 모든 경로
                .allowedOrigins("http://localhost:5173") // 허용할 프론트 주소
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")                     // 모든 요청 헤더 허용
                .allowCredentials(true)                  // 쿠키/인증정보 허용
                .maxAge(3600);                           // Preflight 결과 1시간 캐싱
    }
}