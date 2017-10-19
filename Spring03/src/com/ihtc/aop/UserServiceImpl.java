package com.ihtc.aop;

public class UserServiceImpl implements UserService {

	@Override
	public void save() {
		System.out.println("保存");
	}

	@Override
	public void update() {
		System.out.println("更新");
	}

	@Override
	public void delete() {
		System.out.println("删除");
	}

	@Override
	public void insert() {
		System.out.println("插入");
	}

}