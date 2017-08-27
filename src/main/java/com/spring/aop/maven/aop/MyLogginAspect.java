package com.spring.aop.maven.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Order(1)
//@Component
//@Aspect
public class MyLogginAspect {
	
	@Pointcut("execution(* com.spring.aop.maven.dao.*.add*(..))")
	private void loggingPointcut(){}
	
	@Before("loggingPointcut()")
	public void theLoggingAspect(){
		System.out.println(">>>Executing logging aspect from "+getClass()+"<<<");
	}
	
}
