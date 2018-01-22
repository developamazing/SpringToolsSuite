package com.bis.nj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.bis.nj.*"})
public class GillLaneApplication {

	public static void main(String[] args) {
		SpringApplication.run(GillLaneApplication.class, args);
	}
}
