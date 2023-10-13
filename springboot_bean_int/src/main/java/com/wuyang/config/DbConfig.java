package com.wuyang.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Component
//@Configuration
public class DbConfig {
  @Bean
  public DruidDataSource druidDataSource() {
    DruidDataSource ds = new DruidDataSource();
    return ds;
  }
}
