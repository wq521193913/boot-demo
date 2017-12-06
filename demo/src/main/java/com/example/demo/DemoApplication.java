package com.example.demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan("com.example.mapper")
@ImportResource(locations = {"classpath:config/application-*.xml"})
@ComponentScan(value = {"com.example"})
public class DemoApplication {

	final Logger logger = Logger.getLogger(DemoApplication.class);

//	static {
//		PropertyConfigurator.configure(DemoApplication.class.getResource("/").getPath()+"/log4j.properties");
//	}

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}
}
