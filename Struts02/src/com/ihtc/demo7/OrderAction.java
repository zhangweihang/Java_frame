package com.ihtc.demo7;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class OrderAction extends ActionSupport implements ModelDriven<Order> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Order order  = new  Order();
	
	@Override
	public Order getModel() {
		return order;
	}
	
	List<Order> list;

	public List<Order> getList() {
		return list;
	}

	public void setList(List<Order> list) {
		this.list = list;
	}

	
	private Map<String,Order> map;
	
	

	public Map<String, Order> getMap() {
		return map;
	}

	public void setMap(Map<String, Order> map) {
		this.map = map;
	}

	@Override
	public String execute() throws Exception {
		for (Order order : list) {
			System.out.println(order);
		}
		System.out.println(" ------------------- ------- ");
		Set<String> set = map.keySet();
		for (String key : set) {
			Order order2 = map.get(key);
			System.out.println(key+" : "+order2);
		}
		
		
		
		return NONE;
	}
	
	

	
}
