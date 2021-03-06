package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.BeansFactoryConfig;
import com.learn.factory_parttern.Factory;
import com.learn.factory_parttern.Shape;

@ComponentScan(basePackageClasses = BeansFactoryConfig.class)
public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BeansFactoryConfig.class);
		Factory factory = context.getBean(Factory.class);

		// Yêu cầu khởi tạo một `object` hình tròn và gọi `draw()` để vẽ
		Shape circle = factory.createShape("circle");
		circle.draw();

		// Yêu cầu khởi tạo một `object` hình tam giác và gọi `draw()` để vẽ
		Shape triangle = factory.createShape("triangle");
		triangle.draw();

		// Yêu cầu khởi tạo một `object` hình vuông và gọi `draw()` để vẽ
		Shape square = factory.createShape("square");
		square.draw();

		((AnnotationConfigApplicationContext) context).close();
		
	}
}
