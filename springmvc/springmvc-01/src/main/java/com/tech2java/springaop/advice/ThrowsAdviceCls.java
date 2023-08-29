package com.tech2java.springaop.advice;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdviceCls implements ThrowsAdvice{
	
	public void afterThrowing(IllegalArgumentException ex)throws Throwable{
		
		System.out.println("Inside ThrowsAdviceCls:: "+ex);
	}

}
