package jk.pubsub.solace.forex.trades.main;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

	static final String topicExchangeName = "ForexTradeEventsExchange";

	static final String inputQueueName = "trade-events-input-queue";

	static final String outputQueueName = "trade-events-output-queue";

	public static final String QUALIFIER_INPUT_QUEUE = "InputQueue";
	public static final String QUALIFIER_OUTPUT_QUEUE = "OutputQueue";

	@Bean
	@Qualifier(QUALIFIER_INPUT_QUEUE)
	Queue inputQueue() {
		return new Queue(inputQueueName, false);
	}

	@Bean
	@Qualifier(QUALIFIER_OUTPUT_QUEUE)
	Queue onputQueue() {
		return new Queue(inputQueueName, false);
	}

}
