package com.adithyavisnu.todolist.configuration;

import com.adithyavisnu.todolist.TodolistApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TodolistConfigurationTests {
    @Test
    void testApplicationContext() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TodolistApplication.class);

        Assertions.assertNotNull(applicationContext);
    }
}
