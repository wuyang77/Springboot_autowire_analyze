package com.wuyang.config;

import com.wuyang.bean.Cat;
import com.wuyang.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({Dog.class, DbConfig.class})
@Configuration(proxyBeanMethods = true)
public class SpringConfig4 {

}
