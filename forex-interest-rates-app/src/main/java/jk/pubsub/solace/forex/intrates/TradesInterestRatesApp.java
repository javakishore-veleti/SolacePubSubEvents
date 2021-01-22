package jk.pubsub.solace.forex.intrates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TradesInterestRatesApp {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(TradesInterestRatesApp.class);
		app.run(args);
	}
}
