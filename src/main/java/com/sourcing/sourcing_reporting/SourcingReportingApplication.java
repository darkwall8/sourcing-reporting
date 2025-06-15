package com.sourcing.sourcing_reporting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class
})
public class SourcingReportingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SourcingReportingApplication.class, args);
	}

}
