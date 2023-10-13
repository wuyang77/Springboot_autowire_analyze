package com.wuyang.app;

import com.wuyang.bean.Cat;
import com.wuyang.bean.Dog;
import com.wuyang.bean.Mouse;
import com.wuyang.config.SpringConfig4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App5 {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig4.class);
    ac.registerBean("tom", Cat.class, 0);
    ac.registerBean("tom", Cat.class, 1);
    ac.registerBean("tom", Cat.class, 2);
    ac.registerBean("tom", Cat.class, 3);
    ac.register(Mouse.class);
    for (String beanName : ac.getBeanDefinitionNames()) {
      System.out.println(beanName);
    }
    System.out.println(ac.getBean(Cat.class));
  }
}
