package com.wuyang.service.impl.rabbitmq.topic.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
public class MessageListener {

  @RabbitListener(queues = "topic_Queue1")
  public void receive1(String id) {
    System.out.println("已完成短信业务的发送（rabbitmq topic 11111）.id" + id);
  }

  @RabbitListener(queues = "topic_Queue2")
  public void receive2(String id) {
    System.out.println("已完成短信业务的发送（rabbitmq topic 22222）.id" + id);
  }
}
