package com.wuyang.config;

import java.io.IOException;
import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class MemCachedConfig {
  @Autowired
  private MemcachedPropertiesConfig memcachedPropertiesConfig;
  @Bean
  public MemcachedClient memcachedClient() throws IOException {
    MemcachedClientBuilder memcachedClientBuilder = new XMemcachedClientBuilder(memcachedPropertiesConfig.getServers());
    memcachedClientBuilder.setConnectionPoolSize(memcachedPropertiesConfig.getPoolSize());
    memcachedClientBuilder.setOpTimeout(memcachedClient().getOpTimeout());
    MemcachedClient memcachedClient = memcachedClientBuilder.build();
    return memcachedClient;
  }
}
