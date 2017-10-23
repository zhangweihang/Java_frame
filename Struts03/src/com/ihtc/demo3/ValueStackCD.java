package com.ihtc.demo3;

import com.ihtc.demo2.Cat;
import com.ihtc.demo2.Dog;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ValueStackCD extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		
		Dog dog = new Dog();
		dog.setName("旺财");
		dog.setType("中华田园犬");
		
		Cat cat = new Cat();
		cat.setName("小黑");
		cat.setWeight(100);
		
		ValueStack stack = ActionContext.getContext().getValueStack();
		
		stack.set("dog", dog);
		stack.set("cat", cat);
		
		return SUCCESS;
	}

}
