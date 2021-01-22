package jk.pubsub.solace.forex.trades.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TradeEventInputQueueConsumer {

	@Autowired
	private TradeProcessor eventProc;

}
