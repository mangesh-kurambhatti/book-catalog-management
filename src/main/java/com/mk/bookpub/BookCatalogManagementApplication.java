package com.mk.bookpub;

import com.mk.bookpub.cmdRunner.StartupRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.mk")
public class BookCatalogManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookCatalogManagementApplication.class, args);
	}

	@Bean
	public StartupRunner scheduleRunner(){
		return new StartupRunner();
	}
}
