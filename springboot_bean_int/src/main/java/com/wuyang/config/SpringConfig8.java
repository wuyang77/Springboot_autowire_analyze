package com.wuyang.config;

import com.wuyang.bean.importselector.MyImporterSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(MyImporterSelector.class)
@Configuration
//@ComponentScan("com.wuyang")
public class SpringConfig8 {

}
