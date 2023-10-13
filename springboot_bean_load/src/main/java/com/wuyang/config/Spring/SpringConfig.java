package com.wuyang.config.Spring;

import com.alibaba.druid.pool.DruidDataSource;
import com.wuyang.bean.Cat;
import com.wuyang.bean.Mouse;
import com.wuyang.bean.MyImpotSelector;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Import;

//@Import(MyImpotSelector.class)
//@Import(Mouse.class)
@ComponentScan("com.wuyang")
public class SpringConfig {

  @Bean
//  @ConditionalOnClass(name = "com.wuyang.bean.Mouse")
//  @ConditionalOnMissingClass("com.wuyang.bean.Mouse")
//  @ConditionalOnMissingClass("com.wuyang.bean.Dog")
  @ConditionalOnBean(name = "jack")
  @ConditionalOnWebApplication
  public Cat tom() {
        return new Cat();
  }

  @Bean
  @ConditionalOnClass(name = "com.mysql.cj.jdbc.Driver")
  public DruidDataSource druidDataSource() {
    return new DruidDataSource();
  }
}
