package com.wuyang.service.impl.rabbitmq.topic;

import com.wuyang.service.MessageServcie;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class MessageServiceRabbitmqTopicImpl implements MessageServcie {

  @Autowired
  private AmqpTemplate amqpTemplate;
  @Override
  public void sendMessage(String id) {
    System.out.println("待发送的订单已纳入处理队列（rabbitmq topic======================）,id:" + id);
    amqpTemplate.convertAndSend("topicExchange", "topic.orders.id", id);
  }
  @Override
  public String doMessage() {
    return null;
  }
}
