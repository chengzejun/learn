package com.chengzejun.consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@RabbitListener(queues = "rabbitTopicQueue")
public class TopicReceiver {

    @RabbitHandler
    public void getmsg(HashMap msgMap){
        System.out.println("Topic msg is:"+msgMap.toString());
    }
}
