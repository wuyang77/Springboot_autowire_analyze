package com.wuyang.service.impl.kafka.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

  @KafkaListener(topics = "wuyang_2023")
  public void onMessage(ConsumerRecord<String, String> record) {
    System.out.println("已完成短信发送业务，id(kafka):" + record.value());
  }
}
