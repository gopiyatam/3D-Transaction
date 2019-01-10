package com.cctransaction.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cctransaction")
public class CC3DTransaction {

	public static void main(String[] args) {
		SpringApplication.run(CC3DTransaction.class, args);
		

	}

}
