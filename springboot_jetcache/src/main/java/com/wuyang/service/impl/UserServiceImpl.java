package com.wuyang.service.impl;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.CacheInvalidate;
import com.alicp.jetcache.anno.CacheRefresh;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.CacheUpdate;
import com.alicp.jetcache.anno.Cached;
import com.alicp.jetcache.anno.CreateCache;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuyang.bean.User;
import com.wuyang.dao.UserDao;
import com.wuyang.service.UserService;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<BaseMapper<User>, User> implements UserService {
  @Autowired
  private UserDao userDao;
  @CreateCache(name = "jetCache", expire = 3600, timeUnit = TimeUnit.SECONDS)
  private Cache<String, String> jetCache;

  @Override
  public boolean save(User user) {
    return userDao.insert(user) > 0;
  }

  @Override
  @CacheInvalidate(name = "user_", key = "#id")
  public Boolean delete(Integer id) {
    return userDao.deleteById(id) > 0;
  }
  @Override
  @CacheUpdate(name = "user", key= "#user.id", value = "#user")
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

//  @Override
//  @Cacheable(cacheNames = "cacheSpace", key = "#id")
//  public User getById(Integer id) {
//
//    User user = userDao.selectById(id);
//    return user;
//  }
  @Override
  @Cached(name = "user", key = "#id", expire = 3600, cacheType = CacheType.LOCAL)
  @CacheRefresh(refresh = 5)
  public User getById(Integer id) {
    User user = userDao.selectById(id);
    return user;
  }

  @Override
  public List<User> getAll() {
    return userDao.selectList(null);
  }
}
