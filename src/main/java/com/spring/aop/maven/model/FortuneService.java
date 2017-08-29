package com.spring.aop.maven.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

@Component
@Scope("prototype")
public class FortuneService implements Fortune{
	
	private Random random;
	
	@PostConstruct
	private void init(){
		random = new Random();
		
	}
		
	@Override
	public String getFortune() {
		String [] fortunes ={"You will be very lucky today!","Something horrible will not happened to you today!",
			    "You will experience love, at some point in your life!", "The sky will not fall on you, today that is!"};
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return fortunes[random.nextInt(fortunes.length)];
	}

}
