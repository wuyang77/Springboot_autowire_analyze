package com.wuyang.service.impl.rabbitmq.direct.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
public class MessageListener {

  @RabbitListener(queues = "direct_Queue")
  public void receive(String id) {
    System.out.println("已完成短信业务的发送（rabbitmq direct one）.id" + id);
  }
}
