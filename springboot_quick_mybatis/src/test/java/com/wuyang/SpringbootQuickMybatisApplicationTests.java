package com.wuyang;

import com.wuyang.bean.User;
import com.wuyang.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringbootQuickMybatisApplication.class)
class SpringbootQuickMybatisApplicationTests {
  @Autowired
  private UserDao userDao;

  @Test
  void contextLoads() {
    User user = userDao.getById(3);
    System.out.println(user);
  }

}
