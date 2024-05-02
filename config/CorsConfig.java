package com.management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*"); // 1 Setting the access source address
        corsConfiguration.addAllowedHeader("*"); // 2 Setting the access source request header
        corsConfiguration.addAllowedMethod("*"); // 3 Setting up the access source request method
        corsConfiguration.setAllowCredentials(true);// 4 Allow cookies to be carried across domains
        corsConfiguration.setMaxAge((long) 1209600);
        return corsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig()); // 5 Configure cross-domain settings for the interface
        return new CorsFilter(source);
    }
}
