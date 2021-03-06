package com.ihtc.demo4;

import java.util.ArrayList;
import java.util.List;

import com.ihtc.demo2.Dog;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ValueStackList extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {

		List<Dog> list = new ArrayList<>();
		
		Dog dog1 = new Dog();
		dog1.setName("汪添丁");
		dog1.setType("德牧");

		Dog dog2 = new Dog();
		dog2.setName("汪天才");
		dog2.setType("哈士奇");
		
		list.add(dog1);
		list.add(dog2);
		
		ValueStack stack = ActionContext.getContext().getValueStack();
		
		stack.push(list);
		
		
		return SUCCESS;
	}

}
