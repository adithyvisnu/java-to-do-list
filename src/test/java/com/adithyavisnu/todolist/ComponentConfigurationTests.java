package com.adithyavisnu.todolist;

import com.adithyavisnu.todolist.data.Bar;
import com.adithyavisnu.todolist.data.Foo;
import com.adithyavisnu.todolist.repositories.CategoryRepository;
import com.adithyavisnu.todolist.repositories.ProductRepository;
import com.adithyavisnu.todolist.services.CategoryService;
import com.adithyavisnu.todolist.services.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentConfigurationTests {
    private ConfigurableApplicationContext configurableApplicationContext;

    @BeforeEach
    void setUp() {
        configurableApplicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        configurableApplicationContext.registerShutdownHook();
    }

    @Test
    void testService() {
        ProductService productService1 = configurableApplicationContext.getBean(ProductService.class);
        ProductService productService2 = configurableApplicationContext.getBean(ProductService.class);

        Assertions.assertSame(productService1, productService2);
    }

    @Test
    void testServiceConstructorDependencyInjection() {
        ProductService productService = configurableApplicationContext.getBean(ProductService.class);
        ProductRepository productRepository = configurableApplicationContext.getBean(ProductRepository.class);

        Assertions.assertSame(productService.getProductRepository(), productRepository);
    }

    @Test
    void testServiceSetterDependencyInjection () {
        CategoryService categoryService = configurableApplicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = configurableApplicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryService.getCategoryRepository(), categoryRepository);
    }
}
