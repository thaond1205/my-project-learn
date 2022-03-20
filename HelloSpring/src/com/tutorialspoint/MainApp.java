package com.tutorialspoint;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
	
	   public static void main(String[] args) {
	      ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
	      HelloWorld obj = (HelloWorld) context.getBean("getHelloWorld");
//	      System.out.println(obj);
	      
	      ApplicationContext context2 = new ClassPathXmlApplicationContext("Beans.xml");
	      HelloWorld helo = (HelloWorld) context2.getBean("helloWorld");
	      
//	      System.out.println(helo.toString());
	      displayAllBeans();
	   }
	   public static void displayAllBeans() {
		   ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
	        String[] allBeanNames = context.getBeanDefinitionNames();
	        for(String beanName : allBeanNames) {
	            System.out.println(beanName);
	        }
	    }
}
	