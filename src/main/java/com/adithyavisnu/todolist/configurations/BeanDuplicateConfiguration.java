package com.adithyavisnu.todolist.configurations;

import com.adithyavisnu.todolist.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Slf4j
@Configuration
public class BeanDuplicateConfiguration {
    @Primary
    @Bean
    public Foo foo1 () {
        return new Foo();
    }

    @Bean
    public Foo foo2 () {
        return new Foo();
    }
}
