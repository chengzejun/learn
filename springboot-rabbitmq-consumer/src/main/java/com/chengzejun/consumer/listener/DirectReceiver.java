package com.chengzejun.consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@RabbitListener(queues = "rabbitDirectQueue")
public class DirectReceiver {

    @RabbitHandler
    public void process(HashMap msgMap){
        System.out.println("rabbitmq consumer received message:"+msgMap.toString());
    }
}
