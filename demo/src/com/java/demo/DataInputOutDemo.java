package com.java.demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutDemo {

	public static void main(String[] args) throws IOException {
	/*	String name ="zhangsan";
		int age=10;
		boolean flag=true;
		char sex='男';
		double money=100.56;
		
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\作业\\a.txt"));
		dos.writeUTF(name);
		dos.writeInt(age);
		dos.writeBoolean(flag);
		dos.writeChar(sex);
		dos.writeDouble(money);
		dos.close();*/
		DataInputStream dis=new DataInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\作业\\a.txt"));
		System.out.println(dis.readUTF());
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
		dis.close();
	}

}
