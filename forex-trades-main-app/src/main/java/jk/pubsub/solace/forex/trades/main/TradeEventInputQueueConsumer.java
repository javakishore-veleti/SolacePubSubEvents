package jk.pubsub.solace.forex.trades.main;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jk.pubsub.solace.forex.trades.common.TradeEventInfo;
import jk.pubsub.solace.forex.trades.common.TradeEventResult;

@Component
public class TradeEventInputQueueConsumer {

	// https://reflectoring.io/amqp-request-response/
	@Autowired
	private TradeProcessor eventProc;

	@RabbitListener(queues = RabbitMQConfig.inputQueueName, concurrency = "3")
	public TradeEventResult receive(TradeEventInfo eventInfo) {
		return eventProc.processTradeEvent(eventInfo);
	}

}
