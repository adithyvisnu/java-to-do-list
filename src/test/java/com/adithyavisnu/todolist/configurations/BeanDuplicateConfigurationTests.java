package com.adithyavisnu.todolist.configurations;

import com.adithyavisnu.todolist.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDuplicateConfigurationTests {
    @Test
    void testBeanDuplicateConfiguration() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanDuplicateConfiguration.class);

        // as Bean annotated primary, the result would be primary
        // otherwise it should assert throws because of NoUniqueBeanDefinitionException
//        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
//            Foo foo = applicationContext.getBean(Foo.class);
//        });

        Foo foo = applicationContext.getBean(Foo.class);
    }

    @Test
    void testBeanDuplicateConfigurationSpecific() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanDuplicateConfiguration.class);

        Foo foo1 = applicationContext.getBean("foo1", Foo.class);
        Foo foo2 = applicationContext.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1, foo2);
    }

    @Test
    void testBeanDuplicateConfigurationPrimary() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanDuplicateConfiguration.class);
        Foo foo1 = applicationContext.getBean(Foo.class);
        Foo foo2 = applicationContext.getBean("foo2", Foo.class);

        Foo foo = applicationContext.getBean("foo1", Foo.class);

        Assertions.assertNotSame(foo1, foo2);
        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo, foo2);
    }
}
