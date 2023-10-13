package com.wuyang.bean.importdefinitionregisterar;

import com.wuyang.bean.Dog;
import com.wuyang.bean.service.impl.UserServiceImpl1;
import com.wuyang.bean.service.impl.UserServiceImpl2;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class Registerar1 implements ImportBeanDefinitionRegistrar {

  @Override
  public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
    BeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(UserServiceImpl1.class).getBeanDefinition();
    registry.registerBeanDefinition("yellow 2", beanDefinition);
  }
}
