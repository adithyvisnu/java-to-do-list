package com.adithyavisnu.todolist.configurations;

import com.adithyavisnu.todolist.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class BeanScopeConfiguration {
    @Bean
    @Scope("prototype")
    public Foo foo() {
        log.info("creating new Foo");
        return new Foo();
    }
}
