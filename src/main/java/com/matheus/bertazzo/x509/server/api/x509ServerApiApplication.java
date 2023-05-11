package com.matheus.bertazzo.x509.server.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication(exclude = {UserDetailsServiceAutoConfiguration.class })
@EnableWebSecurity(debug = true)
public class x509ServerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(x509ServerApiApplication.class, args);
	}

}
