package com.adithyavisnu.todolist.configuration;

import com.adithyavisnu.todolist.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {
    private FooConfiguration fooConfig;

    @Bean()
    public Foo foo() {
        return new Foo();
    }
}
