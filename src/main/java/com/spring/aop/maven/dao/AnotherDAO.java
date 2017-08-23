package com.spring.aop.maven.dao;

public class AnotherDAO {
	
	public void addAccount(String message){
		System.out.println(">>>Executing the addAccount() for "+this+"<<<");
	}
	
	
	public void addCloudsOnTheSky(){
		System.out.println("Adding clouds on the sky!");
	}
}
