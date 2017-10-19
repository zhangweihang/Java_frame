package com.ihtc.demo5;

import com.opensymphony.xwork2.ActionSupport;

public class DogAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Dog dog;
	
	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(dog);
		return NONE;
	}
	
}
