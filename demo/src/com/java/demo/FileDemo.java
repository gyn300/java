package com.java.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\Administrator\\Desktop\\ื๗าต\\a.txt");
		System.out.println(file.isFile());
		long length = file.length();
		System.out.println(length);
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		if (file.exists()) {
			boolean delete = file.delete();
			System.out.println(delete);
		}else{
			try {
				boolean file2 = file.createNewFile();
				System.out.println(file2);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
