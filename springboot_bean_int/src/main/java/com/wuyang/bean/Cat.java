package com.wuyang.bean;

import org.springframework.stereotype.Component;

@Component(value = "Tom")
public class Cat {
  public Cat(){};

  int age;
  public Cat(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Cat{" +
        "age=" + age +
        '}';
  }
}
