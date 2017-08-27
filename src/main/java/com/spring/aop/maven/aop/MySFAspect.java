package com.spring.aop.maven.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Order(1)
//@Aspect
//@Component
public class MySFAspect {
	
	@Pointcut("execution(* com.spring.aop.maven.dao.*.add*(..))")
	private void thePointcutForSF(){}
	
	@Before("thePointcutForSF()")
	public void analitycsBeforeAdvice(){
		System.out.println(">>>Running the SF @Before advice"+getClass()+"<<<");
	}
}
