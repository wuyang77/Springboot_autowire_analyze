package com.wuyang.actuator.config;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "pay", enableByDefault = true)
public class PayEndpoint {
  @ReadOperation
  public Object getPay() {
    Map payMap = new HashMap();
    payMap.put("哈哈哈哈", "你支付我快乐");
    payMap.put("等级1", "青铜");
    payMap.put("等级2", "最强王者");
    payMap.put("等级3", "星耀");
    return payMap;
  }
}
