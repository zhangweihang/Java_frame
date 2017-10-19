package com.ithc.jiami;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	public static String getMd5(String value){
		try {
			//调用md5的加密方法
			byte[] digest = MessageDigest.getInstance("md5").digest(value.getBytes());
			//把一个byte数组变成一个16进制的数
			String string = new BigInteger(1,digest).toString(16);
			return string;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.println(MD5.getMd5("100"));
	}
}
