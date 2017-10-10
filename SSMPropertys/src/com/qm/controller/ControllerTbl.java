package com.qm.controller;

import java.awt.print.Pageable;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qm.bean.Tabletbl;
import com.qm.entity.PageBean;
import com.qm.service.UserOrder;
import com.qm.service.UserTable;

@Controller
public class ControllerTbl {

	
	
	@Autowired
	UserTable userTable;
	
	@Autowired
	UserOrder userOrder;
	
	@RequestMapping(value="/tableEdit.do")
	public String tableEdit(@RequestParam("id") Integer id,HttpSession hs){
		Tabletbl tabletbl = userTable.selectById(id);
		hs.setAttribute("tabletbl", tabletbl);
		return "/table/tableEdit";
	}
	
	@RequestMapping(value="tableupsave.do",method=RequestMethod.GET)
	public String tableup(String pageNow,HttpSession hs ,int tid,int ordId,String num,String description,String tflag){
		Tabletbl tabletbl = new Tabletbl();
//		System.out.println(tid);
		tabletbl.setId(tid);
		tabletbl.setFlag(tflag);
		tabletbl.setDescription(description);
		tabletbl.setNum(num);
		tabletbl.setOrdId(ordId);
		hs.setAttribute("tabletbl", tabletbl);
		int i = userTable.updateByPrimaryKey(tabletbl);
		
		
//		System.out.println(i);
		return this.table(hs,pageNow);
	}
	
	@RequestMapping(value="/table.do")
	public String table(HttpSession hs,String pageNow){
		System.out.println(pageNow);
		int currentPage = 1;
//		处理用户列表显示
		if(!(pageNow==""||pageNow==null)){
			currentPage = Integer.parseInt(pageNow);
		}
		String pre ="no";
		String next="no";
		List<Tabletbl> li = userTable.selectBy();
//		传递总长度与当前页数
		PageBean pageBean = new PageBean(li.size(), currentPage);
		pageBean.setRecordTotal(li.size());
		List<Tabletbl> list= userTable.selectPage(pageBean);
	
//		计算页数
		int pageCount = pageBean.getTotalPage();
		
		if(currentPage!=1){
			pre="yes";
		}
		if(currentPage!=pageCount){
			next="yes";
		}
		hs.setAttribute("pageCount", pageCount);
		hs.setAttribute("pre", pre);
		hs.setAttribute("next",next);
		hs.setAttribute("pNow",currentPage);
			hs.setAttribute("table", list);
		return "/table/table";
	}
	
	@RequestMapping(value="delete.do",method=RequestMethod.GET)
	public String deletes(int delid , HttpSession hs ,String pageNow ){
		System.out.println(delid);
		int j = userOrder.deleteByPrimaryKey(delid);
		System.out.println(j);
		int i = userTable.deleteByPrimaryKey(delid);
		System.out.println(i);
		return this.table(hs,pageNow);
	}
	
	@RequestMapping(value="insertselect.do",method=RequestMethod.GET)
	public String insertSelect(HttpSession hs,String num,String pageNow){
		
		List<Tabletbl> list = userTable.selectBy();
		for(int i = 0;i<list.size();i++){
			if(i==list.size()-1){
				int j =list.get(i).getId();
				System.out.println(j);
				Tabletbl tabletbl = new Tabletbl();
				tabletbl.setDescription("a");
				tabletbl.setFlag("0");
				tabletbl.setNum(num);
				tabletbl.setOrdId(0);
				tabletbl.setId(++j);
				int p = userTable.insertSelective(tabletbl);
				System.out.println(p);
			}
		}
		return this.table(hs,pageNow);
		
	}
	
	
	

	
	
	
	
}
