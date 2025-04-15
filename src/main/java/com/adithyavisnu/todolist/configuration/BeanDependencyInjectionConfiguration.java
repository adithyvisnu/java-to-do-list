package com.adithyavisnu.todolist.configuration;

import com.adithyavisnu.todolist.data.Bar;
import com.adithyavisnu.todolist.data.Foo;
import com.adithyavisnu.todolist.data.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDependencyInjectionConfiguration {
    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
