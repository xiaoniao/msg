package com.liuzhuang.mq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liuzz on 2017/8/9.
 */
@Configuration
public class TopicRabbitConfig {

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange("exchange");
    }

    @Bean
    public Binding bindingExchangeHome(Queue queue, TopicExchange topicExchange) {
        return BindingBuilder.bind(queue).to(topicExchange).with("topic:home");
    }

    @Bean
    public Binding bindingExchangeList(Queue queue, TopicExchange topicExchange) {
        return BindingBuilder.bind(queue).to(topicExchange).with("topic:#");
    }
}
