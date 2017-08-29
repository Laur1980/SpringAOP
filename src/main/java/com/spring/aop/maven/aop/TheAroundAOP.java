package com.spring.aop.maven.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TheAroundAOP {
	
	@Pointcut("execution(* com.spring.aop.maven.model.*.getFortune(..))")
	private void thePointcut(){}
	
	@Around("thePointcut()")
	public Object afterGetFortuneRuns(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
		long begin = System.currentTimeMillis();
		
		String method = proceedingJoinPoint.getSignature().toShortString();
		
		Object result = proceedingJoinPoint.proceed();
		
		long end = System.currentTimeMillis();
		
		System.out.println("\n\n===> For the method: "+method+" duration of execution is: "+(end-begin)/1000);
		
		return result;
	}
	
}
