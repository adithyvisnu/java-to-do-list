package com.adithyavisnu.todolist;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.adithyavisnu.todolist.configuration"
})
public class ScanConfiguration {
}
