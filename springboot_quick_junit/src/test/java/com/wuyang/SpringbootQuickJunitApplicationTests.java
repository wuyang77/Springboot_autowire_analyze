package com.wuyang;

import com.wuyang.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootQuickJunitApplicationTests {

  @Autowired
  private BookDao bookDao;

  @Test
  void contextLoads() {
    System.out.println("hello,这是一个测试类的结果");
    bookDao.save();
  }

}
