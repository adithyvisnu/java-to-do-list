package com.adithyavisnu.todolist.configuration;

import com.adithyavisnu.todolist.data.Connection;
import com.adithyavisnu.todolist.data.Foo;
import com.adithyavisnu.todolist.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleConfigurationTests {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    }

    @AfterEach
    void tearDown() {
        applicationContext.close();
    }

    @Test
    void beanScopeConfigurationTest() {
        Connection conn = applicationContext.getBean(Connection.class);
    }

    @Test
    void testServerTest() {
        Server serv = applicationContext.getBean(Server.class);
    }
}
