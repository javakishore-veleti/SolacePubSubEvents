package jk.pubsub.solace.forex.trades.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TradesMainApp {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(TradesMainApp.class);
		app.run(args);
	}
}
