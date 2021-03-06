package com.ihtc.spring;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Car {

	@Override
	public String toString() {
		return "Car [price=" + price + ", name=" + name + ", list=" + list + ", map=" + map + ", strs="
				+ Arrays.toString(strs) + ", set=" + set + ", lp=" + lp + ", sp=" + sp + ", mp=" + mp + "]";
	}
	private Double price;
	private String name;
	private List<String> list;
	private Map<String,String> map;
	private String[] strs;
	private Set<String> set;
	private List<Person> lp;
	private Set<Person> sp;
	private Map<String,Person> mp;
	
	public Car() {
		
	}
	@Autowired
	public Car(Double price, String name, List<String> list, Map<String, String> map, String[] strs, Set<String> set,
			List<Person> lp, Set<Person> sp, Map<String, Person> mp) {
		this.price = price;
		this.name = name;
		this.list = list;
		this.map = map;
		this.strs = strs;
		this.set = set;
		this.lp = lp;
		this.sp = sp;
		this.mp = mp;
	}
	
	public Map<String, Person> getMp() {
		return mp;
	}
	public void setMp(Map<String, Person> mp) {
		this.mp = mp;
	}
	public Set<Person> getSp() {
		return sp;
	}
	public void setSp(Set<Person> sp) {
		this.sp = sp;
	}
	public List<Person> getLp() {
		return lp;
	}
	public void setLp(List<Person> lp) {
		this.lp = lp;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public String[] getStrs() {
		return strs;
	}
	public void setStrs(String[] strs) {
		this.strs = strs;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
