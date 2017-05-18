package com.java.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		IteratorUtil.dir(new File("C:\\Users\\Administrator\\Desktop\\作业\\新建文件夹"));
	}

}
class IteratorUtil{
	private static int level=0;
	public static void dir(File file){
		if (file!=null) {
			//找出递归出口
			//假设是文件或者是空文件夹就返回
			if (file.isFile()||file.listFiles().length==0) {
				return;
			}else{
				File[] files = file.listFiles();
				//要求先输出文件夹在输出文件
				files=sort(files);
				for (File f : files) {
					StringBuilder sb=new StringBuilder();
					if (f.isFile()) {
						sb.append(getTab(level));
						sb.append(f.getName());
					}else{
						sb.append(getTab(level));
						sb.append(f.getName());
						sb.append("\\");
					}
					System.out.println(sb.toString());
					//假如是文件夹
					if (f.isDirectory()) {
						level++;//进入目录遍历,层级加1
						dir(f);//递归
						level--;//目录层级减1,退回上一级目录
					}
				}
			}
		}
	}
	/**
	 * 先目录后文件的排序
	 * @param files
	 * @return
	 */
	private static File[] sort(File[] files){
		List<File> fList=new ArrayList<File>();
		//先目录
		for (File f : files) {
			if (f.isDirectory()) {
				fList.add(f);
			}
		}
		//再放文件
		for (File f : files) {
			if (f.isFile()) {
				fList.add(f);
			}
		}
		//吧集合元素转换成指定大小和类型的File数组
		return fList.toArray(new File[fList.size()]);
	}
	/**
	 * 根据层级数得到\t所组成的字符串
	 * @param level
	 * @return
	 */
	private static String getTab(int level){
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < level; i++) {
			sb.append("\t");
		}
		return sb.toString();
	}
}