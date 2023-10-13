package com.wuyang;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class WebTest {
  @Test
  void testRamdomPort() {

  }
  @Test
  void testWeb(@Autowired MockMvc mvc) throws Exception {
    // 创建虚拟请求，当前访问/users
    MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/users");
    ResultActions action= mvc.perform(builder);
  }

  @Test
  void testStatus(@Autowired MockMvc mvc) throws Exception {
    // 创建虚拟请求，当前访问/users
    MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/users");
    ResultActions actions = mvc.perform(builder);

    // 设置预期值与真实值去比较（断言）
    StatusResultMatchers status = MockMvcResultMatchers.status();
    ResultMatcher ok = status.isOk();
    actions.andExpect(ok);
  }
}
