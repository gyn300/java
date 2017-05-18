package com.java.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		try {
			FileCopy.copy(new File("C:\\Users\\Administrator\\Desktop\\作业\\周末答疑0409.zip"), new File("C:\\Users\\Administrator\\Desktop\\作业\\周末答疑04091.zip"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
class FileCopy{
	public static void copy(File src,File dst) throws IOException {
		FileInputStream fis=new FileInputStream(src);
		FileOutputStream fos=new FileOutputStream(dst);
		BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		//byte [] buf=new byte[1024*1024];//创建1M大小的缓冲区
		int len=0;
		while ((len=bis.read())!=-1) {
			fos.write(len);
		}
		bis.close();
		bos.close();
	}
}