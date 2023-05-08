package org.conteco.SpringSchulungDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringSchulungDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSchulungDbApplication.class, args);
	}

}
