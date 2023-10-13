package com.wuyang;

import com.wuyang.servcie.SendMailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMailApplicationTests {
  @Autowired
  private SendMailService sendMailService;

  @Test
  void contextLoads() {
    sendMailService.sendMail();
  }
}
