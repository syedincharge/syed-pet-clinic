package com.rizvi.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class SyedPetClinicProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SyedPetClinicProjectApplication.class, args);

		System.out.println("My Pet Clinic");
	}
}
