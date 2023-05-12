package com.apistoreup.ApiStoreUp;

import com.apistoreup.ApiStoreUp.autsecurity.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SecurityConfig.class)
public class ApiStoreUpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiStoreUpApplication.class, args);
	}

}
