package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Properties
{
    @Value( "${test1:@null}" )
    private String  test1;
    @Value( "${test2:@null}" )
    private String  test2;

    @Bean
    public String test1()
    {
        return test1;
    }

    @Bean
    public String test2()
    {
        return test2;
    }
}
