package com.wuyang.app;

import com.wuyang.bean.Dog;
import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class App1 {

  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("applictionContext1.xml");
//    Object cat = ac.getBean("cat");
//    System.out.println("cat = " + cat );
//    Dog dog = ac.getBean(Dog.class);
//    System.out.println("dog = " + dog);
    String[] beanDefinitionNames = ac.getBeanDefinitionNames();
    for (String beanDefinitionName : beanDefinitionNames) {
      System.out.println(beanDefinitionName);
    }
  }
}
