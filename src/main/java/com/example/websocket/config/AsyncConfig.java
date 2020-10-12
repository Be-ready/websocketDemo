package com.example.websocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author wss
 * @created 2020/10/12 15:48
 * @since 1.0
 */
@EnableAsync
@Configuration
public class AsyncConfig {
    @Bean
    AsyncTaskExecutor asyncTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(100);
        executor.setQueueCapacity(25);
        executor.setMaxPoolSize(500);
        return executor;
    }
}
