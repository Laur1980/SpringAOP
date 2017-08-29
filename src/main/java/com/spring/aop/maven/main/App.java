package com.spring.aop.maven.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.aop.maven.dao.AccountAop;
import com.spring.aop.maven.dao.AnotherDAO;
import com.spring.aop.maven.model.Fortune;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);) {
			AccountAop dao = context.getBean("accountAop", AccountAop.class);
			AnotherDAO dao2 = context.getBean("anotherDAO", AnotherDAO.class);
			// dao.setId(32132131452342234l);
			// dao2.setId(99999913424314523l);
			// System.out.println(">>> Getting id for "+dao+"
			// "+dao.getId()+"<<<");
			// System.out.println(">>>Getting id for "+dao2+"
			// "+dao2.getId()+"<<<");
			// dao.addSomethingElse("dsadfwer32432452345");
			// dao2.addAccount("asdsadsadasdasdasdasdasdas");
			// dao.addSomethingElse("dasbndjsalkjdbsajldbnljsabdkjsbadjk");
			// dao.addSomethingElse("dasbndjsalkjdbsajldbnldsadasdsadsadsadsadsadjsabdkjsbadjk");
			// dao2.addCloudsOnTheSky();			
			//System.out.println(">>> The find accounts in the container: " + dao.findAccounts(true));
			//System.out.println(">>> The find accounts in the container: " + dao.findAccounts(false));
			Fortune fortune = context.getBean("fortuneService",Fortune.class);
			Fortune misfortune = context.getBean("misfortuneService",Fortune.class);
			System.out.println("Fortune: "+fortune);
			System.out.println("Misfortune: "+misfortune);
			System.out.println("Fortune of the moment is: "+fortune.getFortune());
			System.out.println("Misfortune of the moment is: "+misfortune.getFortune());
		}catch (Exception e) {
			System.out.println(">>>The Exception has been thrown with the message: "+e.getMessage()+" <<<");;
		}
	}
}
