package com.wuyang.bean.service.impl;

import com.wuyang.bean.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl1 implements UserService {
  @Override
  public void check() {
    System.out.println(" user service 1 。。。。。。。。");
  }
}
