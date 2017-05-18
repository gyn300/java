package com.java.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {
		java.util.List<Person1> data=new ArrayList<Person1>();
		data.add(new Person1("zha",16,13));
		data.add(new Person1("rha",18,13));
		data.add(new Person1("cha",15,13));
		data.add(new Person1("qha",15,13));
		Collections.sort(data, new Comparator<Person1>() {

			@Override
			public int compare(Person1 o1, Person1 o2) {
				if (o1.getAge()-o2.getAge()>0) {
					return 1;
				}else if (o1.getAge()-o2.getAge()<0) {
					return -1;
				}else{
					return o1.getName().compareTo(o2.getName());
				}
				
			}
		});
		Iterator<Person1> it = data.iterator();
		while (it.hasNext()) {
			Person1 person1 = (Person1) it.next();
			System.out.println(person1);
		}
	}

}
class Person1{
	private String name;
	private int age;
	private int id;
	
	public Person1(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
}