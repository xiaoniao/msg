package com.liuzhuang.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by liuzz on 2017/8/9.
 */
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(SampleBean sampleBean) {
        this.amqpTemplate.convertAndSend("hello", sampleBean);
    }

    public void sendHome() {
        String context = "hello " + "home";
        System.out.println("Sender : " + context);
        this.amqpTemplate.convertAndSend("exchange", "topic:home", context);
    }

    public void sendList() {
        String context = "hello " + "list";
        System.out.println("Sender : " + context);
        this.amqpTemplate.convertAndSend("exchange", "topic:list", context);
    }
}
