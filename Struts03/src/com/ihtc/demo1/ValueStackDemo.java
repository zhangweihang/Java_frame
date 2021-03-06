package com.ihtc.demo1;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ValueStackDemo extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		//获取值栈对象
		ValueStack stack = ActionContext.getContext().getValueStack();
		
		stack.push("123");
		stack.push("456");
		stack.set("tel", "123456789");
		stack.push(789);
		stack.set("name", "jerry");
		stack.push("呵呵");
		
		return SUCCESS;
	}
	
}
