package com.demo.springbootyamlfile;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class SpringBootYamlFileApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootYamlFileApplication.class, args);
		
//		String[] allBeanNames = context.getBeanDefinitionNames();
//		Arrays.sort(allBeanNames);
//		for(String names:allBeanNames)
//		{
//			System.out.println(names);
//		}
		
		ConfigurableEnvironment environment = context.getEnvironment();
		System.out.println(environment);
	}
}
