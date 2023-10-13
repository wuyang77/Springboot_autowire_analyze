package com.wuyang;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wuyang.bean.User;
import com.wuyang.dao.UserDao;
import com.wuyang.service.UserService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootQuickSsmpApplicationTests {

  @Autowired
  private UserDao userDao;
  @Autowired
  private UserService userService;


  @Test
  void contextLoads1() {
    userDao.selectById(1);
  }

  @Test
  void contextLoads2() {
    userDao.selectList(null);
  }
  @Test
  void contextLoads3() {
    IPage page = new Page(2, 4);
    userDao.selectPage(page, null);
    long current = page.getCurrent();
    long size = page.getSize();
    List records = page.getRecords();
    long pages = page.getPages();
    long total = page.getTotal();
    System.out.println("current = " + current);
    System.out.println("size = " + size);
    System.out.println("records = " + records);
    System.out.println("pages = " + pages);
    System.out.println("total = " + total);
  }

  @Test
  void contextLoads4() {
    QueryWrapper<User> queryWrapper = new QueryWrapper<>();
    queryWrapper.like("nickname", "同学");
    userDao.selectList(queryWrapper);
  }
  @Test
  void contextLoads5() {
    String name = "同学";
    LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
    lambdaQueryWrapper.like(name != null, User::getNickname, name);
    userDao.selectList(lambdaQueryWrapper);
  }
  @Test
  void contextLoads6() {
    userService.getById(1);
  }
}