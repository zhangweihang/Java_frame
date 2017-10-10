package com.qm.entity;

import java.util.List;

import com.qm.bean.Tabletbl;

public class PageBean {
	private static final int PAGE_SIZE = 6;
//	总条数
	private int recordTotal;
	private List<Tabletbl> list;
//	当前页
	private int currentPage = 1;
//	总页数
	private int totalPage;
//	数据库开始查询位置
	private int startIndex;
	
	public PageBean(int recordTotal,int currentPage){
//		验证当前页小于0的情况
		currentPage=currentPage<=0?1:currentPage;
//		计算有多少页
		int value= recordTotal%PAGE_SIZE;
//		计算总页数
		if(value==0){
			totalPage = recordTotal/PAGE_SIZE;
		}
		else{
			totalPage=recordTotal/PAGE_SIZE+1;
		}
		
//		当前页数大于总数
		currentPage=currentPage>totalPage?totalPage:currentPage;

//		计算数据库开始查询位置
		startIndex = (currentPage-1)*PAGE_SIZE;
//		总长度
		this.recordTotal = recordTotal;
//		当前页数
		this.currentPage = currentPage;
	}
	public List<Tabletbl> getList() {
		return list;
	}

	public void setList(List<Tabletbl> list) {
		this.list = list;
	}

	public int getRecordTotal() {
		return recordTotal;
	}
	public void setRecordTotal(int recordTotal) {
		this.recordTotal = recordTotal;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	
	

}
