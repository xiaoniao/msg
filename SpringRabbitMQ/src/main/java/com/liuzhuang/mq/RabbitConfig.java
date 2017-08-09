package com.liuzhuang.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by liuzz on 2017/8/9.
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue queue() {
        return new Queue("hello");
    }

    @Bean
    public Queue queueHome() {
        return new Queue("topic:home");
    }

    @Bean
    public Queue queueList() {
        return new Queue("topic:list");
    }

}
