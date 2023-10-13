package com.wuyang.service.impl.kafka;

import com.wuyang.service.MessageServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceKafkaImpl implements MessageServcie {

  @Autowired
  private KafkaTemplate kafkaTemplate;
  @Override
  public void sendMessage(String id) {
    System.out.println("待发送短信的订单已加入处理队列(Kafka)，id:" + id);
    kafkaTemplate.send("wuyang_2023", id);
  }

  @Override
  public String doMessage() {
    return null;
  }
}
