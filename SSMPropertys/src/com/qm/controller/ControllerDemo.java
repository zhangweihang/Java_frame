package com.qm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qm.bean.Usertbl;
import com.qm.service.UserUtbl;

@Controller
public class ControllerDemo {
	@Autowired
	UserUtbl userUtbl;
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public String Login(String uname,String password,HttpSession hs,String validateCode){
		Usertbl usertbl = userUtbl.selectBy(uname);
		if(!(usertbl==null)){
			String name = usertbl.getUsername();
			String pwd = usertbl.getPassword();
			String vode = (String) hs.getAttribute("validateCode");
			hs.setAttribute("geren", uname);
			if((uname!=null&&password!=null&&validateCode!=null)&&(uname.equals(name))&&pwd.equals(password)&&vode.equalsIgnoreCase(validateCode)){
				return "index";
			}
		}
		return "login";
	}
}
