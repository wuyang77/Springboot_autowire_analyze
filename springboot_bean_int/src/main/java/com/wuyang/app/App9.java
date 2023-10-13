package com.wuyang.app;

import com.wuyang.config.SpringConfig8;
import com.wuyang.config.SpringConfig9;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App9 {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig9.class);
    for (String name : applicationContext.getBeanDefinitionNames()) {
      System.out.println(name);
    }
  }
}
