package com.liuzhuang.mq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by liuzz on 2017/8/9.
 */
@Component
    @RabbitListener(queues = {"topic:list"})
public class ListReceiver {

    @RabbitHandler
    public void topicListProcess(String msg) {
        System.out.println("Receiver list : " + msg);
    }
}