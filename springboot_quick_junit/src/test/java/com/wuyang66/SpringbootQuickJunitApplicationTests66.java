package com.wuyang66;

import com.wuyang.SpringbootQuickJunitApplication;
import com.wuyang.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


//@SpringBootTest(classes = SpringbootQuickJunitApplication.class)
@SpringBootTest
@ContextConfiguration(classes = SpringbootQuickJunitApplication.class)
class SpringbootQuickJunitApplicationTests66 {

  @Autowired
  private BookDao bookDao;

  @Test
  void contextLoads() {
    System.out.println("hello,这是一个测试类的结果");
    bookDao.save();
  }

}
