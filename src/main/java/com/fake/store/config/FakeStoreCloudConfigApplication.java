package com.fake.store.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class FakeStoreCloudConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(FakeStoreCloudConfigApplication.class, args);
	}
}
