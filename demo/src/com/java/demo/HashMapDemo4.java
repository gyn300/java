package com.java.demo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo4 {

	public static void main(String[] args) {
		TreeMap<Dog, String> tMap=new TreeMap<>();
		tMap.put(new Dog("С��",15),"����");
		tMap.put(new Dog("С��",12),"����");
		tMap.put(new Dog("С�ٿ�",18),"����");
		tMap.put(new Dog("С��",14),"����");
		Set<Entry<Dog, String>> entrySet = tMap.entrySet();
		for (Entry<Dog, String> entry : entrySet) {
			System.out.println(entry);
		}
	}
		
}
class Dog implements Comparable<Dog>{
	private String name;
	private int age;
	public Dog(String name, int age) {
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
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Dog o) {
		if (age==o.age) {
			return name.compareTo(o.name);
		}else{
			return age-o.age;
		}
		
	}
	
}