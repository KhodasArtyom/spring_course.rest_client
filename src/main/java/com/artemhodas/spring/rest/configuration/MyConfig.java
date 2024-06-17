package com.artemhodas.spring.rest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.artemhodas.spring.rest")
public class MyConfig {

    @Bean
    protected RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
