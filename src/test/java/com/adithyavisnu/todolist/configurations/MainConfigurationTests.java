package com.adithyavisnu.todolist.configurations;

import com.adithyavisnu.todolist.data.Bar;
import com.adithyavisnu.todolist.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainConfigurationTests {
    private ConfigurableApplicationContext configurableApplicationContext;

    @BeforeEach
    void setUp () {
        configurableApplicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
        configurableApplicationContext.registerShutdownHook();
    }

    @Test
    void mainConfigurationTest() {
        Foo foo = configurableApplicationContext.getBean(Foo.class);
        Bar bar = configurableApplicationContext.getBean(Bar.class);
    }
}
