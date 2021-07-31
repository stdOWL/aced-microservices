package io.aced.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountServiceApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplicationRunner.class, args);
	}

}
