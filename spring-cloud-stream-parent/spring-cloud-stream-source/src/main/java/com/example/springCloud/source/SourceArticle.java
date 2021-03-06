package com.example.springCloud.source;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface SourceArticle {
	//es output
	String ARTICLE = "output-article";

	@Output(ARTICLE)
	MessageChannel sampleSource();
}
