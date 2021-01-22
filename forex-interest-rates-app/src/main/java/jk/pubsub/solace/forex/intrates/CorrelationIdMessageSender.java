package jk.pubsub.solace.forex.intrates;

import javax.print.attribute.standard.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

// https://github.com/lshimokawa/java-samples/blob/master/spring-jms-queue-correlation/src/test/java/net/lshimokawa/ejemplos/springjms/CorrelationIdMessageSender.java
// https://codenotfound.com/spring-jms-jmstemplate-example.html
@Component
public class CorrelationIdMessageSender {

	@Autowired
	private Destination statusDestination;

	@Autowired
	private JmsTemplate jmsTemplate;

	public String sendTradeEvent() {

//		TradeEventInfo tradeEventInfo = new TradeEventInfo();
//		jmsTemplate.convertAndSend(tradeEventInfo, messagePostProcessor -> {
//			message.set(messagePostProcessor);
//			return messagePostProcessor;
//		});
//
//		String messageId = message.get().getJMSMessageID();
//		LOGGER.info("sending OrderNumber='{}' with MessageId='{}'", orderNumber, messageId);
//
//		return messageId;
		return null;
	}
}
