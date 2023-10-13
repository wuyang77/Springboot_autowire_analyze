package com.wuyang.config;

import com.wuyang.bean.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

@SpringBootTest
public class JdbcTest {


  @Test
  void testJdbc(@Autowired JdbcTemplate jdbcTemplate) {
    String sql = "select * from user";
//    List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
//    System.out.println(maps);


    RowMapper<User> rowMapper = new RowMapper<User>() {
      @Override
      public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User temp = new User();
        temp.setId(rs.getInt("id"));
        temp.setUsername(rs.getString("username"));
        return temp;
      }
    };
    List<User> list = jdbcTemplate.query(sql, rowMapper);
    System.out.println(list);
  }
}
