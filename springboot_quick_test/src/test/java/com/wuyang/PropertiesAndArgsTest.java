package com.wuyang;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest()

@SpringBootTest(properties = {"test.prop=testValue1"}, args = {"--test.prop=testValue2"})
public class PropertiesAndArgsTest {

  @Value("${test.prop}")
  private String prop;
  @Test
  void testProperties() {
    System.out.println(prop);
  }
}
