package com.ihtc.note;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EatAcpect {
	
	@Pointcut("execution(* *..*.*Dog.eat*(..))")
	public void fn(){}
	
	@Before(value="fn()")
	public void before(){
		System.out.println("前置通知");
	}

	@After(value="fn()")
	public void after(){
		System.out.println("最终通知");
	}

	@Around(value="fn()")
	public void around(ProceedingJoinPoint pjp){
		
		try {
			System.out.println("环绕通知前");
			pjp.proceed();
			System.out.println("环绕通知后");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
	}

	@AfterThrowing(value="fn()")
	public void exception(){
		System.out.println("异常通知");
	}

	@AfterReturning(value="fn()")
	public void afterR(){
		System.out.println("后置通知");
	}

}
