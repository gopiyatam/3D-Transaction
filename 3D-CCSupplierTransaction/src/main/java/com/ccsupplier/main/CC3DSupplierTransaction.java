package com.ccsupplier.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.ccsupplier")
public class CC3DSupplierTransaction {

	public static void main(String[] args) {
		SpringApplication.run(CC3DSupplierTransaction.class, args);

	}

}
