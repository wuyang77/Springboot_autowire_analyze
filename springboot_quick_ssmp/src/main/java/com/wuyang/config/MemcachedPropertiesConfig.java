package com.wuyang.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component
@Data
//@ConfigurationProperties(prefix = "xmemcached")
public class MemcachedPropertiesConfig {
  private String servers;
  private int poolSize;
  private long opTimeout;
}
