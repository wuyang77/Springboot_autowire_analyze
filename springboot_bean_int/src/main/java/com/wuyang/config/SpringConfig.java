package com.wuyang.config;

import com.wuyang.bean.beanfactory.DogFactroyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.wuyang.bean", "com.wuyang.config"})
public class SpringConfig {

//  @Bean
//  public DogFactroyBean dogFactroyBean() {
//    return new DogFactroyBean();
//  }
}
