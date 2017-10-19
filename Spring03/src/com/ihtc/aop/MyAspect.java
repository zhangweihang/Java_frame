package com.ihtc.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	/*
	 * 增强的方法
	 */
	static int i = 0;
	public void log(){
		System.out.println("日志..."+(++i));
	}
	public void around(ProceedingJoinPoint pjp){
		try {
			System.out.println("环绕前...");
			pjp.proceed();
			System.out.println("环绕后...");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
