package com.wuyang.controller;

import com.wuyang.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

  // 读取ymal数据中的单一数据
  @Value("${country}")
  private String country1;
  @Value("${user.name}")
  private String userName;
  @Value("${likes[1]}")
  private String likes;
  @Value("${users2[1].name}")
  private String name;
  @Value("${server.port}")
  private int port;
  @Value("${tempDir}")
  private String tempDir;
  @Value("${tempDir2}")
  private String tempDir2;

  @Autowired
  private Environment environment;
  @Autowired
  private MyDataSource myDataSource;


  @GetMapping
  public String getById() {
    System.out.println("springboot is running..");
    System.out.println("country:" + country1);
    System.out.println("userName:" + userName);
    System.out.println("likes = " + likes);
    System.out.println("name = " + name);
    System.out.println("port = " + port);
    System.out.println("tempDir = " + tempDir);
    System.out.println("tempDir2 = " + tempDir2);
    System.out.println("--------------------------------");
    String property = environment.getProperty("server.port");
    System.out.println("port = " + property);
    System.out.println("--------------------------------");
    System.out.println("myDataSource = " + myDataSource);
    return "springboot is running..";
  }


}
