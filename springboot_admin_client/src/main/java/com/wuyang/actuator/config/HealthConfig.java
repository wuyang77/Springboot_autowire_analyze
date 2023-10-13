package com.wuyang.actuator.config;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.boot.actuate.health.Status;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HealthConfig extends AbstractHealthIndicator {
  @Override
  protected void doHealthCheck(Builder builder) throws Exception {
    Boolean condition = true;
    if (condition) {
      builder.status(Status.UP);
      builder.withDetail("上线状态", "哇塞666，上线成功了");
    } else {
      builder.status(Status.DOWN);
      builder.withDetail("上线了嘛", "你在做梦吗？没有上线你个小呆呆");
    }
  }
}
