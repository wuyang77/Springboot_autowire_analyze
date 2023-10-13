package com.wuyang.app;

import com.wuyang.config.SpringConfig;
import com.wuyang.config.SpringConfig666;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App666 {

  public static void main(String[] args) {
    ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig666.class);
    String[] beanDefinitionNames = ac.getBeanDefinitionNames();
    for (String beanDefinitionName : beanDefinitionNames) {
      System.out.println(beanDefinitionName);
    }
  }
}
