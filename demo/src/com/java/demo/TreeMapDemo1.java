package com.java.demo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {


	public static void main(String[] args) {
		TreeMap<Person, String> pdate=new TreeMap<Person,String>(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getName().compareTo(o2.getName())>0) {
					return 1;
				}
				else if(o1.getName().compareTo(o2.getName())<0){
					return -1;
				}
				else{
					return o1.getAge()-o2.getAge();
				}
			}
		});
		pdate.put(new Person("zhangsan",30), "张三");
		pdate.put(new Person("lisi",31), "李四");
		pdate.put(new Person("roshan",32), "肉山");
		pdate.put(new Person("zhangsan",33), "王五");
		System.out.println(pdate);
		
	}

}
class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}