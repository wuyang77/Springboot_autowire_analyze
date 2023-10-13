package com.wuyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootQuickSsmpApplication {
  public static void main(String[] args) {
    SpringApplication.run(SpringbootQuickSsmpApplication.class, args);
  }
}
