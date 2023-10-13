package com.wuyang.dao.impl;

import com.wuyang.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

  @Override
  public void save() {
    System.out.println("这是注入BookDao使用save的成功结果");
  }
}
