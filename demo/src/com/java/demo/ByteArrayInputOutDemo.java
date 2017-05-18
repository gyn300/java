package com.java.demo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputOutDemo {

	public static void main(String[] args) throws IOException {
	/*	String str="hello,shanghai";
		ByteArrayInputStream bis=new ByteArrayInputStream(str.getBytes());
		int data=-1;
		while ((data=bis.read())!=-1) {
			System.out.print((char)data);
		}*/
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		bos.write(97);
		bos.write("hello".getBytes());
		byte[] buf = bos.toByteArray();
		for (byte b : buf) {
			System.out.print((char)b);
		}
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\ื๗าต\\aa.txt",true);
		bos.writeTo(fos);
		fos.close();
	}

}
