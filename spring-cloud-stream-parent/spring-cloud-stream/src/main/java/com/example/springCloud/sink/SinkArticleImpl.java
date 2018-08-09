package com.example.springCloud.sink;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.SubscribableChannel;

import com.example.springCloud.data.Article;



@EnableBinding(SinkArticle.class)
public class SinkArticleImpl{
	

	
	@StreamListener(SinkArticle.INPUT)
	public void handle(Article article) {
		System.out.println("Received: " + article.toString());
	
				
	}
	

	
}
