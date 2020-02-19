package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestMain {

	
	
	public static void main(String[] args) {

	ConfigurableApplicationContext ctx=SpringApplication.run(TestMain.class, args);
		
	MyService ser=ctx.getBean("myService",MyService.class);
	
	System.out.println(ser.getMsg("Ramesh"));
	
	}

}
