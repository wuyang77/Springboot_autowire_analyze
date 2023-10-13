package com.wuyang;

import com.wuyang.config.MsgConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(MsgConfig.class)
public class Configuration {
  @Autowired
  private String msg;

  @Test
  void testConfig() {
    System.out.println(msg);
  }
}
