package com.dengjk.clouduserprovid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.dengjk")
@EnableJpaRepositories(basePackages = "com.dengjk.clouduserprovid.dao")
public class CloudUserProvidApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudUserProvidApplication.class, args);
	}
}
