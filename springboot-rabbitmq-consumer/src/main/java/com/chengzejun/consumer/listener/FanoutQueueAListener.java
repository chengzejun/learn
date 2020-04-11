package com.chengzejun.consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@RabbitListener(queues = "FanoutQueueA")
public class FanoutQueueAListener {
    @RabbitHandler
    public void getMsg(HashMap msg){
        System.out.println("FanoutQueueA"+msg.toString());
    }

}
