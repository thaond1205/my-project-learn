package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	   private String message;
	   private int age;
	   
	   public HelloWorld(String message, int age) {
		super();
		this.message = message;
		this.age = age;
	}

	public HelloWorld() {
	   }

	   @Override
	public String toString() {
		return "HelloWorld [message=" + message + ", age=" + age + "]";
	}

	public void setMessage(String message){
	      this.message  = message;
	   }
	   
	   public int getAge() {
		return age;
	}

	public void setAge(int age){
		      this.age  = age;
		   }
	   public String getMessage(){
	      return message;
	   }
	}