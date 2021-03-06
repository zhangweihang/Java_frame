package com.ihtc.demo;

import org.junit.Test;

import ognl.Ognl;
import ognl.OgnlContext;

public class OGNLTest {

	@Test
	public void run1() throws Exception{
		//获取上下文对象
		OgnlContext context = new OgnlContext();
		//获取根对象
		Object root = context.getRoot();
		context.put("tom", "jerry");
		
		Object value1 = Ognl.getValue("#tom",context, root);
		Object value2 = Ognl.getValue("'啦啦啦德玛西亚'",context, root);
		
		System.out.println(value1);
		System.out.println(value2);
		
	}
	
}
