package com.wuyang;

import com.alibaba.druid.pool.DruidDataSource;
import com.wuyang.config.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(ServerConfig.class)
public class SpringbootQuickAutoconfigureApplication {


  @Bean
  @ConfigurationProperties(prefix = "datasource")
  public DruidDataSource dataSource() {
    DruidDataSource dataSource = new DruidDataSource();
    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver666");
    return dataSource;
  }

  public static void main(String[] args) {
    ConfigurableApplicationContext ctx = SpringApplication.run(
        SpringbootQuickAutoconfigureApplication.class, args);
    ServerConfig bean = ctx.getBean(ServerConfig.class);
    System.out.println(bean);
    DruidDataSource ds = ctx.getBean(DruidDataSource.class);
    System.out.println(ds.getDriverClassName());
  }

}
