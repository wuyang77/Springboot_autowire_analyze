package com.wuyang.bean.beanfactory;

import com.wuyang.bean.Dog;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class DogFactroyBean implements FactoryBean<Dog> {

  @Override
  public Dog getObject() throws Exception {
    Dog dog = new Dog();
    return dog;
  }
  @Override
  public Class<?> getObjectType() {
    return Dog.class;
  }
  @Override
  public boolean isSingleton() {
    return !FactoryBean.super.isSingleton();
  }
}
