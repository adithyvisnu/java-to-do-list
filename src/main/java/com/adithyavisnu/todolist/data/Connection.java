package com.adithyavisnu.todolist.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Slf4j
public class Connection implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        log.info("Connection ditutup");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Connection siap digunakan");
    }
}
