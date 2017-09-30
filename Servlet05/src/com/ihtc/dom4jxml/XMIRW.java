package com.ihtc.dom4jxml;

import java.io.InputStream;
import java.io.StringWriter;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class XMIRW {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	public void myWay(List<Element> list){

		for(Element e : list){
			
			if(e.elements().size() != 0){
				myWay(e.elements());
			}else{
				System.out.println(e.getName()+":"+e.getText());
			}
			
		}
		
	}

	@Test
	public void test3() throws Exception {
		
		//获取元素对象
		Element root = DocumentHelper.createElement("web-app");
		//创建文档对象
		DocumentHelper.createDocument(root);
		//开始写
		Element e = root.addElement("welcome-file-list");
		e.addElement("welcome-file").addText("login.jsp");
		e.addElement("welcome-file").addText("index.jsp");
		
		Element e2 = root.addElement("filter");
		e2.addElement("filter-name").addText("filter");
		e2.addElement("filter-class").addText("com.ihtc.dom4jxml.XMIRW");
		
		Element e3 = root.addElement("welcome-file-list");
		e3.addElement("filter-name").addText("filter");
		e3.addElement("url-pattern").addText("/filter");
		
		//设置格式
		//创建字符串的缓冲区
		StringWriter sw = new StringWriter();
		OutputFormat of = new OutputFormat();
		//设置文件编码
		of.setEncoding("utf-8");
		//设置换行
		of.setNewlines(true);
		//设置缩进
		of.setIndent(true);
		//创建写文件的方法
		XMLWriter xw = new XMLWriter(sw,of);
		xw.write(root);
		xw.close();
		System.out.println(sw.toString());
		
	}

	
	@Test
	public void test2() throws DocumentException {
		//获取xml文件的读取流
		SAXReader sax = new SAXReader();
		//获取要读取的xml文件
		InputStream is = XMIRW.class.getResourceAsStream("test.xml");
		Document document = sax.read(is);
		//用文档的对象去获取根标签
		Element element = document.getRootElement();
		//用根标签去获取所有子标签
		List<Element> list = element.elements();
		
		myWay(list);
		
	}

	
	@Test
	public void test1() throws DocumentException {
		//获取xml文件的读取流
		SAXReader sax = new SAXReader();
		//获取要读取的xml文件
		InputStream is = XMIRW.class.getResourceAsStream("test.xml");
		Document document = sax.read(is);
		//用文档的对象去获取根标签
		Element element = document.getRootElement();
		//用根标签去获取所有子标签
		List<Element> list = element.elements();
		
		//取第一层
		List<Element> l1 = list.get(0).elements();
		for(Element e : l1){
			System.out.println(e.getName()+":"+e.getText());
		}
		//取第二层
		List<Element> l2 = list.get(1).elements();
		for(Element e : l2){
			
			if(e.getName().equals("init-param")){
				
				List<Element> l21 = e.elements();
				for(Element e2 : l21){
					System.out.println(e2.getName()+":"+e2.getText());
				}
				
			}else{
				System.out.println(e.getName()+":"+e.getText());
			}
			
		}
		
	}

}
