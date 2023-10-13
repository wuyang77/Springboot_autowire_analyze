package com.wuyang;

import com.wuyang.bean.CartonTomAndJack;
import java.lang.annotation.Repeatable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.autoconfigure.AutoConfigurationImportSelector;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Indexed;

@SpringBootApplication
//@SpringBootApplication
//  @SpringBootConfiguration
//    @Configuration
//      @Component
//    @Indexed
//  @EnableAutoConfiguration
//    @AutoConfigurationPackage
//      @Import(AutoConfigurationPackages.Registrar.class)  //重点
//    @Import(AutoConfigurationImportSelector.class)  重点
//  @ComponentScan(excludeFilters = {
//      @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
//      @Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
//    @Repeatable(ComponentScans.class)
@Import(CartonTomAndJack.class)
public class App {

  public static void main(String[] args) {
    ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
    CartonTomAndJack bean = ctx.getBean(CartonTomAndJack.class);
    bean.play();
  }
}
