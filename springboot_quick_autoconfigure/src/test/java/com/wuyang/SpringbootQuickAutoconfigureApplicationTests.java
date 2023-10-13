package com.wuyang;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootQuickAutoconfigureApplicationTests {

  @Value("${servers.ipAddress}")
  private String ipAddress;
  @Value("${datasource.password}")
  private String password;
  @Test
  void contextLoads() {
    System.out.println(ipAddress);
    System.out.println(password);
  }

}
