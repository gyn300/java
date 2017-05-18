package com.java.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BufferedReadWriterDemo {

	public static void main(String[] args) {
		try {
			Copy.copyFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class Copy{
	public static void copyFile() throws IOException{
		FileReader fr=new FileReader("D:\\a.txt");
		FileWriter fw= new FileWriter("D:\\b.txt");
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		String line = br.readLine();
		while(line!=null){
			bw.write(line);
			bw.newLine();
			line=br.readLine();
		}
		br.close();
		bw.close();
	}
	
}