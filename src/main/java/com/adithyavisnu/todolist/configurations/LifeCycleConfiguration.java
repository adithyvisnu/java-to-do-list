package com.adithyavisnu.todolist.configurations;

import com.adithyavisnu.todolist.data.Connection;
import com.adithyavisnu.todolist.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LifeCycleConfiguration {
    @Bean
    public Connection connection() {
        return new Connection();
    }

    @Bean
//    @Bean( initMethod = "start", destroyMethod = "stop")
    public Server server() {
        return new Server();
    }
}
