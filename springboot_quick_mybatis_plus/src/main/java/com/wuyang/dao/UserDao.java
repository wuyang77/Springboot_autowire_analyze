package com.wuyang.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wuyang.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao extends BaseMapper<User> {
  @Select("select * from user where id=#{id}")
  public User getById(Integer id);
}
