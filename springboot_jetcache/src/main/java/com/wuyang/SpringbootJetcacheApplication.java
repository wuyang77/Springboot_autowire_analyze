package com.wuyang;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCreateCacheAnnotation
@EnableMethodCache(basePackages = "com.wuyang") //开启方法注解
public class SpringbootJetcacheApplication {
  public static void main(String[] args) {
    SpringApplication.run(SpringbootJetcacheApplication.class, args);
  }
}
