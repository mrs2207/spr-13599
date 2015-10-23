package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
public class DemoApplication {
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer()
    {
        final PropertySourcesPlaceholderConfigurer  pspc    = new PropertySourcesPlaceholderConfigurer();

        pspc.setIgnoreResourceNotFound( true );
        pspc.setIgnoreUnresolvablePlaceholders( true );
        // TODO: Doesn't work with Spring 4.2.2 (NullPointerException during autowiring)
        pspc.setNullValue( "@null" );

        return pspc;
    }

    @Autowired
    private String  test1;
    @Autowired
    private String  test2;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
