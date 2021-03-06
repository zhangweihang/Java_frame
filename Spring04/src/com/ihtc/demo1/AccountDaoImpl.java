package com.ihtc.demo1;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
	
	@Override
	public void out(int outId, double money) {
		this.getJdbcTemplate().update("update t_account set user_money=user_money-? where id=?",money,outId);
	}

	@Override
	public void in(int inId, double money) {
		this.getJdbcTemplate().update("update t_account set user_money=user_money+? where id=?",money,inId);
	}

}
