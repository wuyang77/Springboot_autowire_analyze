package com.wuyang.service.impl;

import com.wuyang.service.MessageServcie;
import com.wuyang.service.OrderServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderServcie {

  @Autowired
  private MessageServcie messageServcie;
  @Override
  public void order(String id) {
    System.out.println("订单的处理开始");
    // 订单的处理开始
    messageServcie.sendMessage(id);
    // 短信消息处理
    System.out.println("短信消息处理");



  }
}
