package com.adithyavisnu.todolist;

import com.adithyavisnu.todolist.configurations.BeanDependencyInjectionConfiguration;
import com.adithyavisnu.todolist.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.adithyavisnu.todolist.data.Foo;
import com.adithyavisnu.todolist.data.Bar;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FooBarTests {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(BeanDependencyInjectionConfiguration.class);
    }

    @Test
    void FooBarTest () {
        var foo = new Foo();
        var bar = new Bar();

        var fooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo, fooBar.getFoo());
    }

    @Test
    void FooBarDependencyInjectionTest() {
        Foo foo = applicationContext.getBean(Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
        FooBar fooBar = applicationContext.getBean(FooBar.class);

        Assertions.assertSame(fooBar.getFoo(), foo);
        Assertions.assertSame(fooBar.getBar(), bar);
    }
}
