package jk.pubsub.solace.forex.hedging;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TradesHedgingApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context-all.xml");
	}
}
