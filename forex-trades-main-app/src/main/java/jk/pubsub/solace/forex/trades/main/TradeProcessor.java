package jk.pubsub.solace.forex.trades.main;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jk.pubsub.solace.forex.trades.common.TradeEventInfo;
import jk.pubsub.solace.forex.trades.common.TradeEventResult;

@Component
public class TradeProcessor {

	@Autowired
	private TradeProcessorOutputQueueProducer outputQueueProducer;

	public TradeEventResult processTradeEvent(TradeEventInfo eventInfo) {

		return TradeEventResult.builder().tradeId(eventInfo.getTradeId()).eventProcessCompletedDate(new Date()).build();
	}

}
