package com.spring.aop.maven.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Order(1)
//@Aspect
//@Component
public class MyAnaliticsAspect {
	
	@Pointcut("execution(* com.spring.aop.maven.dao.*.add*(..))")
	private void thePointcutForAnalitics(){}
	
	@Before("thePointcutForAnalitics()")
	public void analitycsBeforeAdvice(){
		System.out.println(">>>Running the Analitics @Before advice"+getClass()+"<<<");
	}
}
