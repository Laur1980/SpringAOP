package com.spring.aop.maven.dao;

public class AnotherDAO {
	
	private Long id;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void addAccount(String message){
		System.out.println(">>>Executing the addAccount() for "+this+"<<<");
	}
	
	public void addCloudsOnTheSky(){
		System.out.println("Adding clouds on the sky!");
	}
	
	private void init(){
		System.out.println("Initializing the " +this +"DAO object");
	}
}
