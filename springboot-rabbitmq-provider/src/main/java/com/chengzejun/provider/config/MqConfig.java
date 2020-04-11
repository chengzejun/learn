package com.chengzejun.provider.config;

import org.springframework.amqp.core.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chengzejun
 */

@Configuration
public class MqConfig {

    /**
     * Queue
     * @return
     */
    @Bean
    public Queue rabbitDirectQueue(){
        return new Queue("rabbitDirectQueue");
    }

    /**
     * DirectExchange
     * @return
     */
    @Bean
    public DirectExchange rabbitDirectExchange(){
        return new DirectExchange("rabbitDirectExchange");
    }


    @Bean
    Binding bindingDirectExchange(){
        return BindingBuilder.bind(rabbitDirectQueue()).to(rabbitDirectExchange()).with("directExchangeRoute");
    }

    /**
     * 主题交换机
     */
    private static final String man="topic.man";
    private static final String woman="topic.woman";

    /**
     * topic queue
     */
    @Bean
    public Queue rabbitTopicQueue(){
        return new Queue("rabbitTopicQueue");
    }

//    @Bean
//    public Queue rabbitTopicQueue2(){
//        return new Queue("rabbitTopicQueue2");
//    }

    /**
     * topic exchange
     * @return
     */
    @Bean
    public TopicExchange rabbitTopicExchange(){
        return new TopicExchange("rabbitTopicExchange");
    }

    /**
     * binding queue with exchange
     */
    @Bean
    Binding bindingTopicExchange(){
        return BindingBuilder.bind(rabbitTopicQueue()).to(rabbitTopicExchange()).with("*.topic.*");
    }

//    @Bean
//    Binding bindingTopicExchange2(){
//        return BindingBuilder.bind(rabbitTopicQueue()).to(rabbitTopicExchange()).with("*.topic");
//    }


}
