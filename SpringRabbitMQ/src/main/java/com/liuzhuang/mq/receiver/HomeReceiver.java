package com.liuzhuang.mq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by liuzz on 2017/8/9.
 */
@Component
    @RabbitListener(queues = {"topic:home"})
public class HomeReceiver {


    @RabbitHandler
    public void topicHomeProcess(String msg) {
        System.out.println("Receiver home : " + msg);
    }

}