package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;







@EnableScheduling
@EnableAspectJAutoProxy(exposeProxy = true)
//@Configuration
//@EnableSwagger2

@SpringBootApplication
public class MicroSApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroSApplication.class, args);
		System.out.println("@@App started");
	}

}
