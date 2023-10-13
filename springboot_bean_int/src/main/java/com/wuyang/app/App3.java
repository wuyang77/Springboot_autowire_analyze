package com.wuyang.app;

import com.wuyang.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3 {

  public static void main(String[] args) {
    ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);

    System.out.println(ac.getBean("dogFactroyBean"));
    System.out.println(ac.getBean("dogFactroyBean"));
    System.out.println(ac.getBean("dogFactroyBean"));
  }
}
