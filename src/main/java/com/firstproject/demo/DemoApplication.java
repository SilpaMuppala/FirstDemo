package com.firstproject.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		int i=100;
		int j=10;
		if(i>j)
		{
			System.out.println("ok");
		}
		else {
			System.out.print("Not ok");
		}
		SpringApplication.run(DemoApplication.class, args);
	}

}
