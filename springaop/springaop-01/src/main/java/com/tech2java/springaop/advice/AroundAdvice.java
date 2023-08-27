package com.tech2java.springaop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("Before method..");
		try {
			
			Object obj=invocation.proceed();
			System.out.println("After method..."+obj);
		}catch(IllegalArgumentException ex) {
			System.out.println("Throws advice..");
			throw ex;
		}
		return null;
	}
	
	

}
