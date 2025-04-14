package com.adithyavisnu.todolist.configuration;

import com.adithyavisnu.todolist.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeanDuplicateConfiguration {
    @Bean
    public Foo foo1 () {
        return new Foo();
    }

    @Bean
    public Foo foo2 () {
        return new Foo();
    }
}
