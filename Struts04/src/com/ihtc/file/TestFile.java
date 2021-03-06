package com.ihtc.file;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class TestFile extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private File upload;
	private String uploadFileName;
	private String uploadContentType;
	
	public void setUpload(File upload) {
		this.upload = upload;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	@Override
	public String execute() throws Exception {
		
		System.out.println("文件名："+uploadFileName);
		System.out.println("文件类型："+uploadContentType);
		
		if(uploadFileName != null){
			
			String uuidname = FileName.getName(uploadFileName);
			File file = new File("E:/testFile/"+uuidname);
			
			FileUtils.copyFile(upload, file);
			
		}
		
		return NONE;
	}
	
}
