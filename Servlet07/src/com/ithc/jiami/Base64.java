package com.ithc.jiami;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import Decoder.BASE64Decoder;
import Decoder.BASE64Encoder;

public class Base64 {
	//加密
	public static String encode(String content) throws UnsupportedEncodingException {
		byte[] encrypted = content.getBytes("utf-8");

		return new BASE64Encoder().encode(encrypted);
	}
                                                      
	//解密
	public static String decode(String content) throws IOException {
		byte[] bytes = new BASE64Decoder().decodeBuffer(content);
		return new String(bytes, "utf-8");
	}
	
	public static void main(String[] args) {
		try {
			//加密
			String encode = Base64.encode("张维行");
			System.out.println(encode);
			//解密
			String decode = Base64.decode(encode);
			System.out.println(decode);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
