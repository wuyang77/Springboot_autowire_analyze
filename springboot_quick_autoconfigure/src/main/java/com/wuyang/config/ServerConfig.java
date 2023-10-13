package com.wuyang.config;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.util.unit.DataSize;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "servers")
@Data
//@Component
@Validated //开启对当前Bean的注入校验
public class ServerConfig {
  private String ipAddress;
  @Max(value = 8888, message = "最大值不能超过8888")
  @Min(value = 202, message = "最小值不能小于202")
  private int port;
  private long timeout;
  @DurationUnit(ChronoUnit.HOURS)
  private Duration serverTimeout;
//  @DataSizeUnit(DataUnit.MEGABYTES)
  private DataSize dataSize;
}
