package com.wuyang.Controller;

import com.wuyang.bean.R;
import com.wuyang.bean.User;
import com.wuyang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController2 {

  @Autowired
  private UserService userService;

  @GetMapping
  public R getAll() {
    return new R(true, userService.getAll());
  }
  @GetMapping("/{id}")
  public R getById(@PathVariable("id") Integer id) {
    return new R(true, userService.getById(id));
  }

  @PostMapping
  public Boolean save(@RequestBody User user) {
    return userService.save(user);
  }
  @PutMapping("/{id}")
  public Boolean save(@PathVariable("id") Integer id) {
    return userService.update(id);
  }
  @DeleteMapping("/{id}")
  public Boolean delete(@PathVariable("id")Integer id) {
    return userService.delete(id);
  }
}
