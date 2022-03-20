package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learn.factory_parttern.Factory;

@Configuration
public class BeansFactoryConfig {

	@Bean
	public Factory factory() {
		return new Factory();
	}
}
