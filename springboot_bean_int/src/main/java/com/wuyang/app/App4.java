package com.wuyang.app;

import com.wuyang.bean.Dog;
import com.wuyang.config.SpringConfig;
import com.wuyang.config.SpringConfig4;
import java.util.Arrays;
import java.util.Collections;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App4 {

  public static void main(String[] args) {
    ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig4.class);
    for (String beanName : ac.getBeanDefinitionNames()) {
      System.out.println(beanName);
    }

    Dog o = ac.getBean(Dog.class);
    System.out.println(o);
  }
}
