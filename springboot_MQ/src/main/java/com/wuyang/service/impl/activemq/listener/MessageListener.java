package com.wuyang.service.impl.activemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

//@Component
public class MessageListener {

    @JmsListener(destination = "order.queue.id") //对消息监听，生产后自动消费
    @SendTo("order.other.queue.id") //返回值绑定这个目标名，消息从一个对列转移到另一个队列
    public String receive(String id) {
      System.out.println("已完成短信发送业务，id:" + id);
      return "new:" + id;
    }
}
