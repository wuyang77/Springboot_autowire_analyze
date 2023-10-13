package com.wuyang.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImpotSelector implements ImportSelector {

  @Override
  public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    Class<?> clazz = null;
    try {
      clazz = Class.forName("com.wuyang.bean.Mouse");
      if (clazz != null) {
        return new String[]{"com.wuyang.bean.Cat"};
      }
    } catch (ClassNotFoundException e) {
//      throw new RuntimeException(e);
      return new String[0];
    }
    return null;
  }
}
