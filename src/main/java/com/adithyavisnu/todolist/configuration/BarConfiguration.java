package com.adithyavisnu.todolist.configuration;


import com.adithyavisnu.todolist.data.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {
    private BarConfiguration fooConfig;

    @Bean
    public Bar bar() {
        return new Bar();
    }
}