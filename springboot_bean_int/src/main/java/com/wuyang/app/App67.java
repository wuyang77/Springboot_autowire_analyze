package com.wuyang.app;

import com.wuyang.config.SpringConfig67;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App67 {

  public static void main(String[] args) {
    ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig67.class);
    String[] beanDefinitionNames = ac.getBeanDefinitionNames();
    for (String beanDefinitionName : beanDefinitionNames) {
      System.out.println(beanDefinitionName);
    }

    System.out.println("================================================");
    SpringConfig67 springConfig67 = ac.getBean("springConfig67", SpringConfig67.class);
    System.out.println(springConfig67.cat());
    System.out.println(springConfig67.cat());
    System.out.println(springConfig67.cat());
    System.out.println(ac.getBean("cat"));
    System.out.println(ac.getBean("cat"));
    System.out.println(ac.getBean("cat"));
  }
}
