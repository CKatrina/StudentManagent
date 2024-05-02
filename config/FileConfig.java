package com.management.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;


@Configuration
public class FileConfig {

    /**
     * Configure file upload size
     */
    @Bean
    public MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //  Individual data size 100M
        factory.setMaxFileSize("102400KB");
        /// Total upload data size 100M
        factory.setMaxRequestSize("102400KB");
        return factory.createMultipartConfig();
    }

}
