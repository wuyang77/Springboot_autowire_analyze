package com.wuyang.app;

import com.wuyang.bean.service.impl.UserServiceImpl1;
import com.wuyang.config.SpringConfig67;
import com.wuyang.config.SpringConfig68;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App68 {

  public static void main(String[] args) {
    ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig68.class);
    String[] beanDefinitionNames = ac.getBeanDefinitionNames();
    for (String beanDefinitionName : beanDefinitionNames) {
      System.out.println(beanDefinitionName);
    }
  }
}
