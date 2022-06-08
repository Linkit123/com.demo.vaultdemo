package com.demo.vaultdemo;

import com.demo.vaultdemo.configuration.VaultConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Configuration
public class VaultWithSpringApplication {

	@Value("${app.my_vault.username}")
	private String username;

	@Value("${app.my_vault.password}")
	private String password;

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(VaultWithSpringApplication.class, args);
		VaultConfig vaultconfig = context.getBean(VaultConfig.class);
//		System.out.println("Username: " + vaultconfig.getUsername());
//		System.out.println("Password: " + vaultconfig.getPassword());
	}

	@PostConstruct
	void test() {
		System.out.println("---------> username: " + username);
		System.out.println("---------> password" + password);
	}
}
