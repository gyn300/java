package com.java.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TeacherTest {

	public static void main(String[] args) {
		Mystack<String> ms=new Mystack<String>();
		ms.push("zhan");
		ms.push("li");
		ms.push("wang");
		ms.push("zhao");
		ms.pop();
		for (String string : ms.getDate()) {
			System.out.println(string);
		}
		Iterator<String> it=ms.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	
	}
}
class Mystack<T>{
	private LinkedList<T> date=null;
	public Mystack(){
		setDate(new LinkedList<T>());
	}
	public void push(T obj){
		getDate().addFirst(obj);
	}
	public T pop(){
		return getDate().removeLast();
	}
	public LinkedList<T> getDate() {
		return date;
	}
	public void setDate(LinkedList<T> date) {
		this.date = date;
	}
	public Iterator<T> iterator(){
		return date.iterator();
	}
}
