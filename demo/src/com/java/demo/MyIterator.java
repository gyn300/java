package com.java.demo;

public class MyIterator<T> implements Iterator<T> {
	private List<T> list=null;
	private int index=0;
	public MyIterator(List<T> list){
		this.list=list;
	}
	@Override
	public boolean hasNext() {
		return index<list.size();
		
	}

	@Override
	public T next() {
		return list.get(index++);
	}

}
