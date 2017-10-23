package com.ihtc.file;

import java.util.UUID;

public class FileName {

	public static String getName(String name){
		
		int i = name.lastIndexOf(".");
		String lastName = name.substring(i);
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		
		return uuid+lastName;
		
	}
	
}
