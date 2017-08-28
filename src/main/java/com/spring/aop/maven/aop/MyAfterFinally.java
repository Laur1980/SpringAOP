package com.spring.aop.maven.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
@Component
public class MyAfterFinally {
	
	@After("execution(* com.spring.aop.maven.dao.*.find*(..))")
	public void theAfterFinallyAdvice(JoinPoint joinPoint){
		System.out.println(">>>Executing the @After Advice for "+((MethodSignature)joinPoint.getSignature()).toLongString()+" <<<");
	}
	
}
