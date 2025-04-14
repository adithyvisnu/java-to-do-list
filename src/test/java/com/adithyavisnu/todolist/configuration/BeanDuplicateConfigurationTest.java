package com.adithyavisnu.todolist.configuration;

import com.adithyavisnu.todolist.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDuplicateConfigurationTest {
    @Test
    void testBeanDuplicateConfiguration() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanDuplicateConfiguration.class);

        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo = applicationContext.getBean(Foo.class);
        });
    }

    @Test
    void testBeanDuplicateConfigurationSpecific() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanDuplicateConfiguration.class);

        Foo foo1 = applicationContext.getBean("foo1", Foo.class);
        Foo foo2 = applicationContext.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1, foo2);
    }
}
