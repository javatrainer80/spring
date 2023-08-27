package com.tech2java.springaop.advice;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdviceCls implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("Inside afterReturning methos.. "+returnValue +"--"+new Date());
		
	}
	
	

}
