package com.tech2java.springcore;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class Message implements ApplicationListener<ContextStartedEvent>{

	private String desc;
	
	public Message() {
		System.out.println("Message Object is created by Container..");
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("Inside ContextStartedEvent..");
		
	}

	@Override
	public String toString() {
		return "Message [desc=" + desc + "]";
	}
	
}
