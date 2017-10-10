package com.qm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qm.bean.Usertbl;
import com.qm.service.UserUtbl;

@Controller
public class HomeController {

	@RequestMapping(value="/index.do")
	public String index(){
		return "index";
	}
	
	
	@Autowired
	UserUtbl userUtbl;
	
	Usertbl usertbl;
	
	@RequestMapping(value="/grzx.do")
	public String grzxs(HttpSession hs){
		usertbl= userUtbl.selectBy(hs.getAttribute("geren").toString());
		hs.setAttribute("usertbl",usertbl);
		return "grzx";
	}
	
	@RequestMapping(value="/refresh.do")
	public String grzx(HttpSession hs,int uid,String uname,String password,String name,String gender,int permission,String remark){
	 usertbl= userUtbl.selectBy(uname);
	 usertbl.setGender(gender);
	 usertbl.setId(uid);
	 usertbl.setName(name);
	 usertbl.setPassword(password);
	 usertbl.setPermission(permission);
	 usertbl.setRemark(remark);
	 int i = userUtbl.updateByPrimaryKeySelective(usertbl);
//	 System.out.println(i);
		hs.setAttribute("usertbl",usertbl);
		return "grzx";
	}
	
	
	
	@RequestMapping(value="/save.do")
	public String amend(String uname,String password){
		String pwd = password;
		usertbl.setPassword(pwd);
		usertbl.setUsername(uname);
		int i = userUtbl.updateByPrimaryKeySelective(usertbl);
//		System.out.println(i);
		return "grzx";
	}
	

	
}
