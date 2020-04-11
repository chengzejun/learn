package com.chengzejun.provider.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

@RestController
@RequestMapping("/msg")
public class MsgController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/productMsg")
    public void productMsg(){
        HashMap map=new HashMap();
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mmm:SS");
        map.put("msgId",String.valueOf(UUID.randomUUID()));
        map.put("msgtext","my name is  chengzejun");
        map.put("createTime",sdf.format(date));

        rabbitTemplate.convertAndSend("rabbitDirectExchange","directExchangeRoute",map);
    }

    @GetMapping("/productTopicMsg")
    public void productTopicMsg(){
        HashMap map=new HashMap();
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mmm:SS");
        map.put("msgId",String.valueOf(UUID.randomUUID()));
        map.put("msgtext","my name is  chengzejun,topic,man");
        map.put("createTime",sdf.format(date));

        rabbitTemplate.convertAndSend("rabbitTopicExchange","ExchangeRoute.topic",map);
    }

    @GetMapping("/productFanout")
    public void productFanout(){
        HashMap map=new HashMap();
        LocalDateTime date=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        map.put("msgId",String.valueOf(UUID.randomUUID()));
        map.put("msgtext","my name is  chengzejun,topic,man");
        map.put("createTime",formatter.format(date));

        rabbitTemplate.convertAndSend("fanoutExchange",null,map);
    }
}
