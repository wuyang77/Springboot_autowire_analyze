package com.wuyang.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Component;

@Component("Tom")
@ConditionalOnBean(name = "jack")
@ConditionalOnNotWebApplication
public class Cat {

}
