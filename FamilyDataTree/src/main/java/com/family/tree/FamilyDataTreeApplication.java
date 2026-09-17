package com.family.tree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(
		  exclude = {
		    org.springframework.ai.vectorstore.neo4j.autoconfigure.Neo4jVectorStoreAutoConfiguration.class
		  }
		)
		public class FamilyDataTreeApplication {
		  public static void main(String[] args) {
		    SpringApplication.run(FamilyDataTreeApplication.class, args);
		  }

		  @Bean
		  public WebMvcConfigurer corsConfigurer() {
		    return new WebMvcConfigurer() {
		      @Override
		      public void addCorsMappings(CorsRegistry registry) {
		        registry.addMapping("/**")
		                .allowedOrigins("*")
		                .allowedMethods("*")
		                .allowedHeaders("*");
		      }
		    };
		  }
		}

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class FamilyDataTreeApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(FamilyDataTreeApplication.class, args);
//	}
//
//}
