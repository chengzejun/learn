package com.chengzejun.consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@RabbitListener(queues = "FanoutQueueB")
public class FanoutQueueBListener {
    @RabbitHandler
    public void getMsg(HashMap msg){
        System.out.println("FanoutQueueB"+msg.toString());
    }

}
