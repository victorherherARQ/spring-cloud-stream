package com.example.springCloud.processor;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

import com.example.springCloud.data.Article;

@EnableBinding(Processor.class)
public class ProcessorPerson {

	@StreamListener(Processor.INPUT)
	@SendTo(Processor.OUTPUT)
	public String processOrder(Article person) {
	
		System.out.println("Received: " + person);
		person.setName(person.getName().toUpperCase());
		
		return person.toString();
		
	}

}
