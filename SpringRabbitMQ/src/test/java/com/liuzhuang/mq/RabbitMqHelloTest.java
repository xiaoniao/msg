package com.liuzhuang.mq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liuzz on 2017/8/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqHelloTest {

    @Autowired
    private HelloSender helloSender;

    @Test
    public void testHello() throws Exception {
        helloSender.send(new SampleBean("sport"));
    }

    @Test
    public void testHome() throws Exception {
        helloSender.sendHome();
    }

    @Test
    public void testList() throws Exception {
        helloSender.sendList();
    }
}