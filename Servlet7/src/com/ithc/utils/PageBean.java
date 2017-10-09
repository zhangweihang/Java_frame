package com.ithc.utils;

public class PageBean {
	//每页显示多少条数据
	public static final int PAGE_SIZE = 8;
	//页面数
	private int pageCount;
	//数据库的查询位置，这个值需要计算
	private int  startPage;
	
	// currentPage 当前页   listSize总长度
	public PageBean(int currentPage,int listSize){
		//计算有多少页
		int page = listSize/PAGE_SIZE;
		if(page == 0){
			this.pageCount = page;
		}else{
			this.pageCount = page + 1;
		}
		
		if(currentPage < 1){
			currentPage = 1;
		}
		if(currentPage > pageCount){
			currentPage = pageCount;
		}
		//计算数据库的查询位置
		this.startPage = (currentPage-1)*PAGE_SIZE;
		
	}
	
	
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
}
