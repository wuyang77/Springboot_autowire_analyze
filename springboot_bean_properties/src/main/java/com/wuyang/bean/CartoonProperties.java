package com.wuyang.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

//@Component
@ConfigurationProperties(prefix = "cartoon")
@Data
public class CartoonProperties {
  private Cat cat;
  private Mouse mouse;
}
