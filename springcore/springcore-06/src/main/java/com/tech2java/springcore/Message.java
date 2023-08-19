package com.tech2java.springcore;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Message {

	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inside init method.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method.");
	}

}

