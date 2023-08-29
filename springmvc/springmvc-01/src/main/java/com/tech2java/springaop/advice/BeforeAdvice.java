package com.tech2java.springaop.advice;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("BeforeAdvice::before method is executed..."+target.toString() +"-"+new Date());
	}
	
	

}
