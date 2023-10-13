package com.wuyang.config;

import com.wuyang.bean.importdefinitionregisterar.MyImportDefinitionRegisterar;
import com.wuyang.bean.importselector.MyImporterSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(MyImportDefinitionRegisterar.class)
@Configuration
public class SpringConfig9 {

}
