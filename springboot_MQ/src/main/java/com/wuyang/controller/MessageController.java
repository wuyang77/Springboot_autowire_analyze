package com.wuyang.controller;

import com.wuyang.service.MessageServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class MessageController {

  @Autowired
  private MessageServcie messageServcie;
  @GetMapping
  public String doMessage() {
    String id = messageServcie.doMessage();
    return id;
  }
}
