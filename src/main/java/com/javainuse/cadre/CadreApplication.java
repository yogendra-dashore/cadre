package com.javainuse.cadre;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.javainuse.cadre.entity.Category;

@SpringBootApplication
public class CadreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadreApplication.class, args);

	}
	@Bean
	public ModelMapper getMapper() {
		return new ModelMapper();
	}
}
