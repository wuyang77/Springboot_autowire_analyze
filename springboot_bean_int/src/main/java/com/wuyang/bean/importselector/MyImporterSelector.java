package com.wuyang.bean.importselector;

import java.util.Map;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 玩点花活
 */
public class MyImporterSelector implements ImportSelector {

  @Override
  public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    System.out.println(importingClassMetadata.getClassName()); // @Import导入了当前类的所在类的类名
    Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(
        "org.springframework.context.annotation.ComponentScan"); // @Import导入了当前类的所在类 里面的注解锁包含的属性
    System.out.println(annotationAttributes);
    boolean flag = importingClassMetadata.hasAnnotation(
        "org.springframework.context.annotation.Configuration"); // @Import导入了当前类的所在类 是否包含这个注解
    System.out.println(flag);
    if (flag) {
      return new String[]{"com.wuyang.bean.Cat"}; // 如果包含@Configuration这个类就选择注入Cat
    } else {
      return new String[]{"com.wuyang.bean.Dog"}; // 如果不包含@Configuration这个类就选择注入Dog
    }
  }
}
