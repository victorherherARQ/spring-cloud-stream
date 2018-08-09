package com.example.springCloud.sink;



import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;


	
	public interface SinkArticle {
		  String INPUT = "input-article";

		  @Input(SinkArticle.INPUT)
		  SubscribableChannel input();
		}

	

