package com.ihtc.demo11;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Demo11Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		
		ActionContext ac = ActionContext.getContext();
		Map<String,Object> map = ac.getParameters();
		Set<String> set = map.keySet();
		
		for(String string:set){
			
			Object obj = map.get(string);
			
			if(obj.getClass().isArray()){
				System.out.println(string+":"+Arrays.toString((String[])obj));
			}else{
				System.out.println(string+"..:"+obj);
			}
			
		}
		
		ac.getApplication().put("cat","汤姆");
		
		ac.getSession().put("mouse", "杰瑞");
		
		ac.put("play", "猫捉老鼠？老鼠玩猫！！！");
		
		return SUCCESS;
		
	}

}
