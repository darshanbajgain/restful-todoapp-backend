package com.darshan.mytodobackend.todoappbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class TodoappbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoappbackendApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			public void addCorsMappings ( @NonNull CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedMethods("*")
				.allowedOrigins("http://localhost:5173");
				
			}
		};
	}	

}
