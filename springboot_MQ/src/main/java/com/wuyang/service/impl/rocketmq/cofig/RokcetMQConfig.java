package com.wuyang.service.impl.rocketmq.cofig;

import org.apache.rocketmq.client.impl.producer.DefaultMQProducerImpl;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RokcetMQConfig {
    @Bean
    public RocketMQTemplate rocketMQTemplate() {
//      RocketMQTemplate rocketMQTemplate = rocketMQTemplate(defaultMQProducer);
      return new RocketMQTemplate();
    }
}
