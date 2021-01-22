package jk.pubsub.solace.forex.trades.main;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

	public static final String topicExchangeName = "ForexTradeEventsExchange";
	public static final String inputQueueName = "trade-events-input-queue";
	public static final String outputQueueName = "trade-events-output-queue";

	public static final String QUALIFIER_INPUT_QUEUE = "InputQueue";
	public static final String QUALIFIER_OUTPUT_QUEUE = "OutputQueue";

	private String routingkeyInput = "trade-devents-input";
	private String routingkeyOutput = "trade-devents-output";

	@Autowired
	private AmqpAdmin amqpAdmin;

	@Bean
	@Qualifier(QUALIFIER_INPUT_QUEUE)
	Queue inputQueue() {
		return new Queue(inputQueueName, false);
	}

	@Bean
	@Qualifier(QUALIFIER_OUTPUT_QUEUE)
	Queue onputQueue() {
		return new Queue(outputQueueName, false);
	}

	@Bean
	DirectExchange exchange() {
		return new DirectExchange(topicExchangeName);
	}

	@Bean
	@Qualifier("QUALIFIER_INPUT_QUEUE_Binding")
	Binding binding(@Qualifier(QUALIFIER_INPUT_QUEUE) Queue queue, DirectExchange exchange) {
		amqpAdmin.declareQueue(queue);
		return BindingBuilder.bind(queue).to(exchange).with(routingkeyInput);
	}

	@Bean
	@Qualifier("QUALIFIER_OUTPUT_QUEUE_Binding")
	Binding bindingOutputQueue(@Qualifier(QUALIFIER_OUTPUT_QUEUE) Queue queue, DirectExchange exchange) {
		amqpAdmin.declareQueue(queue);
		return BindingBuilder.bind(queue).to(exchange).with(routingkeyOutput);
	}

	@Bean
	public MessageConverter jsonMessageConverter() {
		return new Jackson2JsonMessageConverter();
	}

//	@Bean
//	public AmqpTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
//		final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
//		rabbitTemplate.setMessageConverter(jsonMessageConverter());
//		return rabbitTemplate;
//	}

}
