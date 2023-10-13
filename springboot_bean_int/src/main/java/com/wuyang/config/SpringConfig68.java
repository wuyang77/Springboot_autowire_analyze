package com.wuyang.config;

import com.wuyang.bean.PostProcessor.MyPostProcessor;
import com.wuyang.bean.importdefinitionregisterar.Registerar1;
import com.wuyang.bean.importdefinitionregisterar.Registerar2;
import com.wuyang.bean.service.impl.UserServiceImpl1;
import org.springframework.context.annotation.Import;

@Import({UserServiceImpl1.class, Registerar1.class, Registerar2.class, MyPostProcessor.class})
public class SpringConfig68 {

}
