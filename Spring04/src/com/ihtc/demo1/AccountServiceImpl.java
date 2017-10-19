package com.ihtc.demo1;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	private TransactionTemplate transactionTemplate;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	@Override
	public void transfer(final int outId, final int inId, final double money) {
		
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			                        //有异常回滚方法
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				
				accountDao.out(outId, money);
				accountDao.in(inId, money);
				
			}
			
		});
		
		
	}

}
