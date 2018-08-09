package com.example.springCloud.processor;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

import com.example.springCloud.data.Article;

@EnableBinding(Processor.class)
public class ProcessorArticle {

	@StreamListener(Processor.INPUT)
	@SendTo(Processor.OUTPUT)
	public Article processOrder(Article article) {
	
		System.out.println("Received: " + article);
		article.setName(article.getName().toUpperCase());
		
		return article;
		
	}

}
