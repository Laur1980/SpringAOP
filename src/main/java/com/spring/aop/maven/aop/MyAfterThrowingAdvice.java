package com.spring.aop.maven.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
@Component
public class MyAfterThrowingAdvice {
		
	@Pointcut("execution(* com.spring.aop.maven.dao.*.find*(..))")
	private void thePointcut(){}
	
	@AfterThrowing(pointcut="thePointcut()",
										  throwing ="exception")
	public void afterThrowingAdvice(JoinPoint joinPoint, Throwable exception){
		System.out.println(">>>Execution the @AfterThrowing advice for the method "+((MethodSignature)joinPoint.getSignature()).toShortString()
													+" for the exception: "+exception.getMessage()+"<<<");
	}
	
}
