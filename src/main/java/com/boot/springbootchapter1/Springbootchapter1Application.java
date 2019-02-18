package com.boot.springbootchapter1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@SpringBootApplication
public class Springbootchapter1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootchapter1Application.class, args);
	}

	@GetMapping("/demo1")
	public String demo1(){
		return "hello bro";
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext applicationContext){
		return args -> {
			System.out.println("来看看 springboot 默认为我们提供得bean");
			String[] beanNames = applicationContext.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			//Arrays.stream(beanNames).forEach(System.out::println);
		};
	}
}
