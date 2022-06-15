package com.jq.azuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDemoApplication {
	
	@GetMapping("/message")
	public String message() {
		return "This is an Azure demo. Test 3";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureDemoApplication.class, args);
	}

}
