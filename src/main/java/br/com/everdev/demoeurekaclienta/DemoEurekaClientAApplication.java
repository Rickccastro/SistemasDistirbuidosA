package br.com.everdev.demoeurekaclienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoEurekaClientAApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaClientAApplication.class, args);
	}

}
