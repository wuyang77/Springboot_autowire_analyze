package com.wuyang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wuyang.bean.User;
import java.util.List;

public interface UserService extends IService<User> {
  boolean save(User user);
  Boolean delete(Integer id);
  Boolean update(Integer id);
  User getById(Integer id);
  List<User> getAll();
}
