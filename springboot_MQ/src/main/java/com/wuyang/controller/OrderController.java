package com.wuyang.controller;

import com.wuyang.service.OrderServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

  @Autowired
  private OrderServcie orderService;

  @PostMapping("{id}")
  public void Order(@PathVariable("id")String id) {
    orderService.order(id);
  }
}
