package com.liuzhuang.mq.receiver;

import com.liuzhuang.mq.SampleBean;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by liuzz on 2017/8/9.
 */
@Component

public class HelloReceiver {

    @RabbitListener(queues = {"hello"})
    @RabbitHandler
    public void processSampleBean(SampleBean sampleBean) {
        System.out.println("Receiver  : " + sampleBean.getName());
    }


    @RabbitHandler
    public void processString(String msg) {
        System.out.println("Receiver  : " + msg);
    }

}