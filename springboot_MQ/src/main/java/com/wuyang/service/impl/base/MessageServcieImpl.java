package com.wuyang.service.impl.base;

import com.wuyang.service.MessageServcie;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

//@Service
public class MessageServcieImpl implements MessageServcie {
  private ArrayList<String> mgList = new ArrayList<>();
  @Override
  public void sendMessage(String id) {
    System.out.println("待发送短信的订单已加入处理队列，id:" + id);
    mgList.add(id);
  }

  @Override
  public String doMessage() {
    String id = mgList.remove(0);
    System.out.println("已完成短信发送业务，id:" + id);
    return null;
  }
}
