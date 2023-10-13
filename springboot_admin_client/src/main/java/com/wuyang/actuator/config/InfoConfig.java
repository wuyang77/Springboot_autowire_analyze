package com.wuyang.actuator.config;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.actuate.health.HealthContributor;
import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InfoConfig implements InfoContributor {
  @Override
  public void contribute(Builder builder) {
    builder.withDetail("运行时间", System.currentTimeMillis());
    Map infoMap =  new HashMap();
    infoMap.put("创建时间", "2023.10.11");
    builder.withDetails(infoMap);
  }
}
