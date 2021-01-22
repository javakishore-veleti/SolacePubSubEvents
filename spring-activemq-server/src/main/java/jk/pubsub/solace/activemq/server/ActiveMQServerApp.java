package jk.pubsub.solace.activemq.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActiveMQServerApp {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(ActiveMQServerApp.class);
		app.run(args);
	}
}
