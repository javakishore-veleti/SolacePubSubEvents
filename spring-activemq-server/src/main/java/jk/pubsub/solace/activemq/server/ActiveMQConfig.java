package jk.pubsub.solace.activemq.server;

import org.apache.activemq.broker.BrokerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @EnableJms
@Configuration
public class ActiveMQConfig {

	// https://codeaches.com/spring-boot/embedded-activemq-5-jms-broker
	@Value("${activemq.broker.url}")
	String brokerUrl;

	@Bean
	public BrokerService broker() throws Exception {

		BrokerService broker = new BrokerService();
		broker.setPersistent(false);
		broker.setUseJmx(true);
		broker.addConnector(brokerUrl);
		return broker;
	}

//	@Bean
//	public JmsListenerContainerFactory<?> queueListenerFactory() {
//		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
//		factory.setMessageConverter(messageConverter());
//		return factory;
//	}
//
//	@Bean
//	public MessageConverter messageConverter() {
//		MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
//		converter.setTargetType(MessageType.TEXT);
//		converter.setTypeIdPropertyName("_type");
//		return converter;
//	}

}
