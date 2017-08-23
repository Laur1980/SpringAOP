package com.spring.aop.maven.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.aop.maven.dao.AccountAop;
import com.spring.aop.maven.dao.AnotherDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	

    	
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);){
	        AccountAop dao = context.getBean("accountAop",AccountAop.class);
	        AnotherDAO dao2 = context.getBean("anotherDAO",AnotherDAO.class);
	        dao.addSomethingElse("dsadfwer32432452345");
	        dao2.addAccount("asdsadsadasdasdasdasdasdas");
	        dao.addSomethingElse("dasbndjsalkjdbsajldbnljsabdkjsbadjk");
	        dao.addSomethingElse("dasbndjsalkjdbsajldbnldsadasdsadsadsadsadsadjsabdkjsbadjk");
	        dao2.addCloudsOnTheSky();
        }
    } 
}
