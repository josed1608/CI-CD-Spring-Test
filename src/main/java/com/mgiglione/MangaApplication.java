package com.mgiglione;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = { "com.mgiglione" })
@EnableAsync
public class MangaApplication extends SpringBootServletInitializer {

    @Bean
    protected RestTemplate getTemplate() {
        return new RestTemplate();
    }
    
    public static void main(String[] args) {
        new SpringApplicationBuilder(MangaApplication.class).run(args);
    }
    
    


}
