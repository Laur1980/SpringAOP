package com.spring.aop.maven.dao;

import org.springframework.stereotype.Component;

//@Component
public class AccountAop {
	
	public void init(){
		System.out.println("Initializing the " +this +"DAO object");
	}
	public void addSomethingElse(String name){
		System.out.println(getClass()+" added the "+name+" account ");
	}
	
	public void destroy(){
		System.out.println("Destroying the " +this +"DAO object");
	}
	
}
