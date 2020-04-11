package com.chengzejun.provider.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class FanoutRabbitConfig {

    @Bean
    public Queue fanoutQueueA(){
        return new Queue("FanoutQueueA");
    }

    @Bean
    public Queue fanoutQueueB(){
        return new Queue("FanoutQueueB");
    }

    @Bean
    public Queue fanoutQueueC(){
        return new Queue("FanoutQueueC");
    }


    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    public Binding bindingQueueA(){
        return BindingBuilder.bind(fanoutQueueA()).to(fanoutExchange());
    }

    @Bean
    public Binding bindingQueueB(){
        return BindingBuilder.bind(fanoutQueueB()).to(fanoutExchange());
    }

    @Bean
    public Binding bindingQueueC(){
        return BindingBuilder.bind(fanoutQueueC()).to(fanoutExchange());
    }
}
