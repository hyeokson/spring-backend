package com.konkuk.vecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.security.core.parameters.P;
import org.springframework.web.filter.HiddenHttpMethodFilter;


@SpringBootApplication
public class VectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VectoApplication.class, args);
	}



}
