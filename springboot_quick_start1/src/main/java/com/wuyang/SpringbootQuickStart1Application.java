package com.wuyang;

import com.wuyang.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication //引导类
public class SpringbootQuickStart1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(SpringbootQuickStart1Application.class, args);
		BookController bean1= cac.getBean(BookController.class);
		User bean2 = cac.getBean(User.class);
		System.out.println("bean=======>" + bean1);
		System.out.println("bean=======>" + bean2);
	}

}
