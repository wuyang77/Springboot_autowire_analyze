package com.wuyang.bean;

import lombok.Data;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Data
@EnableConfigurationProperties(CartoonProperties.class)
public class CartonTomAndJack {

  private Cat cat;
  private Mouse mouse;

  private CartoonProperties cartoonProperties;

  public CartonTomAndJack(CartoonProperties cartoonProperties) {
    this.cartoonProperties = cartoonProperties;
    cat = new Cat();
    mouse = new Mouse();
    cat.setName(cartoonProperties.getCat() != null && StringUtils.hasText(cartoonProperties.getCat().getName()) ? cartoonProperties.getCat().getName() : "汤姆");
    cat.setAge(cartoonProperties.getCat() != null && cartoonProperties.getCat().getAge() != null ? cartoonProperties.getCat().getAge() : 8);
    mouse.setName(cartoonProperties.getMouse() != null && cartoonProperties.getMouse().getName() != null ? cartoonProperties.getMouse().getName() : "杰瑞");
    mouse.setAge(cartoonProperties.getMouse() != null && cartoonProperties.getMouse().getAge() != null ? cartoonProperties.getMouse().getAge() : 6);
  }


  public void play() {
    System.out.println(cat.getAge() + "岁的" + cat.getName() + "和" + mouse.getAge() + "岁的" + mouse.getName() + "打起来了");
  }
}
