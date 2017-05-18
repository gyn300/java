package com.java.demo;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class StudentTest {

	public static void main(String[] args) {

		/*
		 * String info = "stuId,name,age"; String[] split = info.split(",");
		 * Student1 stu = new Student1(split[0], split[1], split[2]);
		 * System.out.println(stu); Scanner input = new Scanner(System.in);
		 * System.out.println("请输入身份证号码"); String i = input.next();
		 * System.out.println(i.substring(6, 14));
		 */
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		String[] str = { "asda", "ret", "vsa", "asdf", "vdft", "qwr" };
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length()!=o2.length()) {
					return o1.length()-o2.length();
				}else{
				return o1.compareTo(o2);
				}
			}
		});
		for (String string : str) {
			System.out.println(string);
		}
	}

}

class Str implements Comparable<String> {
	private String s;

	public void sort(String[] str) {
		Arrays.sort(str);
	}

	@Override
	public int compareTo(String o) {
		if (this.s.length() - o.length() > 0) {
			return 1;
		} else if (this.s.length() - o.length() < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}

class Student1 {
	private String stuId;
	private String name;
	private String age;

	public Student1(String stuId, String name, String age) {
		this.stuId = stuId;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student1 [stuId=" + stuId + ", name=" + name + ", age=" + age + "]";
	}

}
