package com.spring.aop.maven.aop;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.spring.aop.maven.model.Account;


@Component
@Aspect
public class MyAspect {
	
	//@Pointcut("execution( * com.spring.aop.maven.dao.*.* (..))")
	private void thePointcutDeclaration(){}
	
	//@Pointcut("execution(* com.spring.aop.maven.dao.*.init*(..))")
	private void thePointcutForInit(){}
	
	//@Pointcut("execution(* com.spring.aop.maven.dao.*.destroy*(..))")
	private void thePointcutForDestroy(){}
	
	//@Before("execution(public void addAccount(..))")
	//@Before("execution(public void com.spring.aop.maven.dao.*.* (..))")
	//@Before("thePointcutDeclaration()")
	public void theAddAccountAdvice(){
		System.out.println("\n =====> Executing @Before advice for every method in the dao package!");
	}
	
	//@Around("execution(public void com.spring.aop.maven.dao.*.add*(..))")
	public void theAddAccountAdviceAround(JoinPoint joinPoint){
		//System.out.println("\n =====> Executing @Around advice for any add methods");
		MethodSignature signature =(MethodSignature) joinPoint.getSignature();
		Object [] objects = joinPoint.getArgs();
		StringBuilder sb = new StringBuilder();
		if(objects !=null){
			int counter=0;
			for(Object o: objects){
				sb.append(o);
				if(objects.length!=1 && counter<objects.length-1)sb.append(" | ");
				counter++;
			}
		}
		System.out.println("\n\n>>>Running @Aroound advice"+getClass()+" for the method: "+signature.toString()+(objects != null?" with arguments: "+sb.toString():""));
			
	}
	

	@AfterReturning(pointcut="execution(* com.spring.aop.maven.dao.*.find*(..))",
			        returning="result")
	public void afterReturningAdvice(JoinPoint joinPoint, List<Account> result){
		String methodSignature = ((MethodSignature)joinPoint.getSignature()).toShortString();
		System.out.println("\n\n>>>Executing @AfterReturning for "+methodSignature);
		System.out.println(">>>The List<Account> before the modifications"+result+"<<<");
		for(Account a:result){
			a.setAccountSerial("BLA BLA BLA BLA");
		}
	}
	//@Before("thePointcutDeclaration()")
	public void theAddSomethingAdviceSecond(){
		System.out.println("\n =====> Executing the @Before advice from theAddSomethingAdviceSecond for any methods in the dao package!");
	}
	
//	@Before("thePointcutDeclaration() && !(thePointcutForInit() || thePointcutForDestroy())")
	public void theAddAndTheInitAndDestroyAdvice(){
		System.out.println("\n ********* The @Before advice for the pointcutdeclaration and detroy and init");
	}
}
