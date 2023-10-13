package com.wuyang.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuyang.bean.User;
import com.wuyang.dao.UserDao;
import com.wuyang.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<BaseMapper<User>, User> implements UserService {
  @Autowired
  private UserDao userDao;


  @Override
  public boolean save(User user) {
    return userDao.insert(user) > 0;
  }

  @Override
  public Boolean delete(Integer id) {
    return userDao.deleteById(id) > 0;
  }

  @Override
  public Boolean update(Integer id) {
    return userDao.deleteById(id) > 0;
  }

  @Override
  public User getById(Integer id) {
    return userDao.selectById(id);
  }

  @Override
  public List<User> getAll() {
    return userDao.selectList(null);
  }
}
