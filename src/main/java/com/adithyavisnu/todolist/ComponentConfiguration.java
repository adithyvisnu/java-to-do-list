package com.adithyavisnu.todolist;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "com.adithyavisnu.todolist.services",
        "com.adithyavisnu.todolist.repositories",
        "com.adithyavisnu.todolist.configurations"
})
public class ComponentConfiguration {
}
