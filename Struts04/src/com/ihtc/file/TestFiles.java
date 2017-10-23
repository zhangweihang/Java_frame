package com.ihtc.file;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class TestFiles extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	List<File> upload;
	List<String> uploadFileName;
	List<String> uploadContentType;
	
	public void setUpload(List<File> upload) {
		this.upload = upload;
	}
	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public void setUploadContentType(List<String> uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	
	@Override
	public String execute() throws Exception {
		
		if(uploadFileName != null){
			
			for(int i = 0;i<uploadFileName.size();i++){
				
				String name = uploadFileName.get(i);
				String uuidname = FileName.getName(name);
				File file = new File("E:/testFile/"+uuidname);
				FileUtils.copyFile(upload.get(i), file);
						
			}
			
		}
		
		return NONE;
	}
	

}
