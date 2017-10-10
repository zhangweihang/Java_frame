package com.qm.controller;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.MultipartFilter;

import com.mysql.jdbc.log.Log;
import com.qm.bean.Menutbl;
import com.qm.bean.Menutypetbl;
import com.qm.entity.PageBean;
import com.qm.service.UserMenu;
import com.qm.service.Usermenutype;

@Controller
public class ControllerMenu {

	@Autowired
	UserMenu userMenu;
	
	@Autowired
	Usermenutype usermenutype;
	
	@RequestMapping(value="menu.do",method=RequestMethod.GET)
	public String selectMenu(HttpSession hs,String pageNow){
		
		int currentPage = 1;
		if(!(pageNow==""||pageNow==null)){
			currentPage=Integer.parseInt(pageNow);
		}
		String pre = "no";
		String next="no";
		List<Menutbl> alllistmenu=userMenu.selectAll();
//		传递总长度与当前页数
		PageBean pageBean = new PageBean (alllistmenu.size(),currentPage); 
//		传递总条数
		pageBean.setRecordTotal(alllistmenu.size());
//		查询起始位置
		System.out.println(pageBean.getStartIndex());
//		查询所有内容
		List<Menutbl> menulist=userMenu.selectLimit(pageBean);
//		查询总页数
		int pageCount=pageBean.getTotalPage();
//		当前页数不等于1 就会显示出来上一页
		if(currentPage!=1){
			pre="yes";
		}
//		当前页数不等于总页数就会显示下一页
		if(currentPage!=pageCount){
			next="yes";
		}
		hs.setAttribute("pageCount", pageCount);
		hs.setAttribute("pre", pre);
		hs.setAttribute("next", next);
		hs.setAttribute("menulist",menulist);
		hs.setAttribute("pNow", currentPage);
		return "/menu/menu";
	}
	
	
	@RequestMapping(value="menuPre.do",method=RequestMethod.GET)
	public String selectPre(HttpSession hs,int id){
		System.out.println(id);
		Menutbl menulist = userMenu.selectByPrimaryKey(id);
		 List<Menutypetbl> menutypelist= usermenutype.selectAll(menulist.getTypeid());
		 usermenutype.seleceId(id);
		 hs.setAttribute("menutypelist",menutypelist);
		 hs.setAttribute("menulist",menulist);
		return "/menu/menuPre";
	}
	
	@RequestMapping(value="update.do",method=RequestMethod.GET)
	public String updateTo(int id,HttpSession hs){
		
		Menutbl menulist = userMenu.selectByPrimaryKey(id);
		List<Menutypetbl> menutypelist= usermenutype.selectAll(menulist.getTypeid());
		usermenutype.seleceId(id);
		hs.setAttribute("menutypelist",menutypelist);
		hs.setAttribute("menulist",menulist);
		return "/menu/menuEdit";
	}
	
//	@RequestMapping("/uploadImg")
//	public void uploadImg(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest req) {
//		log.info(file);
//		// 以下路径为临时存放图片的路径，通过session获取 servlet上下文并获取路径，upload为自己创建的文件夹
//		String path = req.getSession().getServletContext().getRealPath("upload");
//		System.out.println(path);
//		File newFile = new File(path, file.getOriginalFilename());
//		// 文件夹不存在则创建
//		if (!newFile.exists()) {
//			newFile.mkdirs();
//			try {
//				// 将接收到的文件传输到给定的目标文件。
//				file.transferTo(newFile);
//			} catch (Exception e) {
//				e.printStackTrace();
//			} 
//		}

//	,@RequestParam(value = "file", required = false) MultipartFile file 
	@RequestMapping(value="updatesave.do")
	public String updateSave(HttpSession hs,@RequestParam(value = "photo") String photo,String menutypes,@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("price") String price,@RequestParam("remark") String remark) throws UnsupportedEncodingException{
		 
//		String path = "/SSMPropertys/images";
////		获取图片名字
//		String fileName = file.getOriginalFilename();
//		// targetFile 保存文件的路径
//		File targetFile = new File(path, fileName);
//		if (!targetFile.exists()) {
//			targetFile.mkdirs();
//		}
//
//		// 保存
//		try {
//			file.transferTo(targetFile);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		// 查看显示结果的数据

//		new String(name.getBytes("ISO-8859-1"),"UTF-8")
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
		System.out.println(remark);
		System.out.println(photo);
		System.out.println(menutypes);
		Menutbl menutbl = new  Menutbl();
		menutbl.setId(id);
		menutbl.setPic(photo);
		menutbl.setName(new String(name.getBytes("ISO-8859-1"),"UTF-8"));
		menutbl.setPrice(price);
		menutbl.setTypeid(id);
		menutbl.setRemark(new String(remark.getBytes("ISO-8859-1"),"UTF-8"));
		int i = userMenu.updateBy(menutbl);
		if(i==1){
			hs.setAttribute("updMenu","yes");
		}
		System.out.println(i);
		return this.updateTo(id, hs);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
