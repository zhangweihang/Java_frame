package com.ihtc.util;

public class PageCount {
	//每页显示的数据条数
	public static final int PAGE_SIZE = 8;
	//页面数
	private int pages;
	//数据库查询所在位置
	private int index;
	
	//currentPage当前页  listSize总长度
	public PageCount(int currentPage,int listSize){
		
		//计算有多少页
		int page = listSize/PAGE_SIZE;
		
		if(page <= 0){
			this.pages = 1;
		}else{
			this.pages = page+1;
		}
		
		if(currentPage<1){
			currentPage = 1;
		}
		
		if(currentPage>this.pages){
			currentPage = this.pages;
		}
		
		this.index = (currentPage-1)*PAGE_SIZE;
		
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
}
