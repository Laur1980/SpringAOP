package com.spring.aop.maven.model;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MisfortuneService implements Fortune {

	private Random random;
	
	@PostConstruct
	private void init(){
		random = new Random();
	}
		
	@Override
	public String getFortune() {
		String [] fortunes ={"You will die today, of boredom!","It will rain with black cats, only on you!",
			                                       "You will experience love,in another life!", "The sky will fall on you, be very happy... NOT!"};
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return fortunes[random.nextInt(fortunes.length)];
	}
}
