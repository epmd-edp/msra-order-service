package com.epam.edp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.web.client.RestTemplate;

@EnableRetry
@Configuration
public class RestTemplateConfig {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
