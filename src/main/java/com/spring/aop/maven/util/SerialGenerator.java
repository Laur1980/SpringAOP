package com.spring.aop.maven.util;
import java.util.Random;

public final class SerialGenerator {
	
	private SerialGenerator(){}
	
	private static String getSerial(int n){
		StringBuilder sb = new StringBuilder();
		String source ="0123456789abcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		for(int i=0;i<n;i++){
			sb.append(source.charAt(random.nextInt(source.length())));
		}
		return sb.toString();
	}
	
	public static String getAccountSerial(){
		return getSerial(20);
	}
	
}
