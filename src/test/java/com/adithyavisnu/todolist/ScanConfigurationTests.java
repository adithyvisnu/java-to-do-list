package com.adithyavisnu.todolist;

import com.adithyavisnu.todolist.data.Bar;
import com.adithyavisnu.todolist.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScanConfigurationTests {
    private ConfigurableApplicationContext configurableApplicationContext;

    @BeforeEach
    void setUp() {
        configurableApplicationContext = new AnnotationConfigApplicationContext(ScanConfiguration.class);
        configurableApplicationContext.registerShutdownHook();
    }

    @Test
    void testScan() {
        Foo foo = configurableApplicationContext.getBean(Foo.class);
        Bar bar = configurableApplicationContext.getBean(Bar.class);
    }


}
