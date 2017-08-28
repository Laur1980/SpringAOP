package com.spring.aop.maven.dao;

import java.util.LinkedList;
import java.util.List;

import com.spring.aop.maven.model.Account;
import com.spring.aop.maven.util.SerialGenerator;

//@Component
public class AccountAop {
	
	private Long id;
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private void init(){
		System.out.println("Initializing the " +this +"DAO object");
	}
	public void addSomethingElse(String name){
		System.out.println(getClass()+" added the "+name+" account ");
	}
	
	private void destroy(){
		System.out.println("Destroying the " +this +"DAO object");
	}
	
	
	public List<Account> findAccounts(boolean b)throws Exception{
		List<Account> accounts = new LinkedList<>();
		if(b == false)throw new Exception("The exception you are waiting for!");
		for(int i=0;i<20;i++){
			accounts.add(new Account(SerialGenerator.getAccountSerial()));
		}
		return accounts;
	}
}
