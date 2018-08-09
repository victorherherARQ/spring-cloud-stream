package com.example.springCloud.source;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.util.StringUtils;

@EnableBinding(SourceArticle.class)
public class SourceArticleImpl {

	private final Log logger = LogFactory.getLog(getClass());

	@Bean
	@InboundChannelAdapter(value = SourceArticle.ARTICLE, poller = @Poller(fixedDelay = "1000", maxMessagesPerPoll = "1"))
	public MessageSource<String> timerMessageSource() {
		return new MessageSource<String>() {
			public Message<String> receive() {
				 
				String value = "{ \"code\":\"5\" , \"name\":\"Sam Sami\"}";
				logger.info("Sending value: " + value);
				return MessageBuilder.withPayload(value).build();
			}
		};

	}
}
