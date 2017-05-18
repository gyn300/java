package com.java.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		IteratorUtil.dir(new File("C:\\Users\\Administrator\\Desktop\\��ҵ\\�½��ļ���"));
	}

}
class IteratorUtil{
	private static int level=0;
	public static void dir(File file){
		if (file!=null) {
			//�ҳ��ݹ����
			//�������ļ������ǿ��ļ��оͷ���
			if (file.isFile()||file.listFiles().length==0) {
				return;
			}else{
				File[] files = file.listFiles();
				//Ҫ��������ļ���������ļ�
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
					//�������ļ���
					if (f.isDirectory()) {
						level++;//����Ŀ¼����,�㼶��1
						dir(f);//�ݹ�
						level--;//Ŀ¼�㼶��1,�˻���һ��Ŀ¼
					}
				}
			}
		}
	}
	/**
	 * ��Ŀ¼���ļ�������
	 * @param files
	 * @return
	 */
	private static File[] sort(File[] files){
		List<File> fList=new ArrayList<File>();
		//��Ŀ¼
		for (File f : files) {
			if (f.isDirectory()) {
				fList.add(f);
			}
		}
		//�ٷ��ļ�
		for (File f : files) {
			if (f.isFile()) {
				fList.add(f);
			}
		}
		//�ɼ���Ԫ��ת����ָ����С�����͵�File����
		return fList.toArray(new File[fList.size()]);
	}
	/**
	 * ���ݲ㼶���õ�\t����ɵ��ַ���
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