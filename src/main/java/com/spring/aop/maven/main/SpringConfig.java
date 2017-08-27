package com.spring.aop.maven.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

import com.spring.aop.maven.aop.MyAspect;
import com.spring.aop.maven.dao.AccountAop;
import com.spring.aop.maven.dao.AnotherDAO;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"com.spring.aop.maven.main","com.spring.aop.maven.dao","com.spring.aop.maven.aop"})
public class SpringConfig {
		
	@Bean(initMethod = "init",destroyMethod="destroy")
	@Scope("singleton")
	public AccountAop accountAop(){
		return new AccountAop();
	}
	
	@Bean(initMethod="init")
	@Scope("prototype")
	public AnotherDAO anotherDAO(){
		return new AnotherDAO();
	}
	
	@Bean
	public MyAspect myAspect(){
		return new MyAspect();
	}
}
