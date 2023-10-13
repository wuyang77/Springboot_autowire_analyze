package com.wuyang.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuyang.bean.User;
import com.wuyang.dao.UserDao;
import com.wuyang.service.UserService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<BaseMapper<User>, User> implements UserService {
  @Autowired
  private UserDao userDao;
//  @Autowired
//  private MemcachedClient memcachedClient;
  private Counter counter;
  public UserServiceImpl(MeterRegistry meterRegistry) {
    counter = meterRegistry.counter("用户付费次数");
  }
  @Override
  public boolean save(User user) {
    return userDao.insert(user) > 0;
  }

  @Override
  public Boolean delete(Integer id) {
    counter.increment();
    return userDao.deleteById(id) > 0;
  }

  @Override
  public Boolean update(Integer id) {
    return userDao.deleteById(id) > 0;
  }

  private HashMap<Integer, User> cache = new HashMap<>();

//  @Override
//  public User getById(Integer id) {
//    User user = cache.get(id);
//    if (user == null) {
//      User user1 = userDao.selectById(id);
//      cache.put(id, user1);
//      return user1;
//    }
//    return user;
//  }

  @Override
  @Cacheable(cacheNames = "cacheSpace", key = "#id")
  public User getById(Integer id) {
    User user = userDao.selectById(id);
    return user;
  }

  @Override
  public List<User> getAll() {
    return userDao.selectList(null);
  }
}
