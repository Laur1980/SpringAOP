package com.spring.aop.maven.aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


//@Component
@Aspect
public class MyAspect {
	
	//@Before("execution(public void addAccount(..))")
	@Before("execution(public void com.spring.aop.maven.dao.*.* (..))")
	public void theAddAccountAdvice(){
		System.out.println("\n =====> Executing @Before advice for addAccount");
	}
	
	@Around("execution(public void add*(..))")
	public void theAddAccountAdviceAround(){
		System.out.println("\n =====> Executing @Around advice for any add methods");
	}

	
}
