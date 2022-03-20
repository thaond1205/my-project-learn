package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = HelloWorld.class)
public class JavaConfiguration {
	
	@Bean
	public HelloWorld getHelloWorld() {
		HelloWorld hello = new HelloWorld("Nguyen Duc Thao", 20);
		hello.toString();
		
		return hello;
	}

}
