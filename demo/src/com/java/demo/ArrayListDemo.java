package com.java.demo;

public class ArrayListDemo<T> implements List<T>{
	private Object[] obj;
	private int index;
	private int size;
	public ArrayListDemo(Comparable<Person> comparable){
		obj=new Object[10];
		index=0;
		size=0;
	}
	@Override
	public void add(T obj) {
		this.obj[index++]=obj;
		size++;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) obj[index];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Iterator<T> iterator() {
		return new MyIterator<T>(this);
	}
	
}
