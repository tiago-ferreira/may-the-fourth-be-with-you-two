package com.may.the.fourth.be.with.you.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ApplicationConfig.class)
public class MayTheFourthWithYouTwo {

	public static void main(String[] args) {
		SpringApplication.run(MayTheFourthWithYouTwo.class, args);
	}
}
