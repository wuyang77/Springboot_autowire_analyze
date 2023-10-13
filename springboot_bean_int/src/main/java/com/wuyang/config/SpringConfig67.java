package com.wuyang.config;

import com.wuyang.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = true)
public class SpringConfig67 {
  @Bean
  public Cat cat() {
    return new Cat();
  }
}
