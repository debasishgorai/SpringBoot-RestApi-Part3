package SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

import SpringBootApplication.service.QueoteClient;

@SpringBootApplication
public class SbRestAppiQueoteClientApp28Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(SbRestAppiQueoteClientApp28Application.class, args);

	QueoteClient bean=context.getBean(QueoteClient.class);
	bean.invokerQuete();
	
	
	}

}
