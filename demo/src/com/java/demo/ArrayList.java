package com.java.demo;

import java.util.LinkedHashSet;

public class ArrayList {

	public static void main(String[] args) {
		java.util.List<String> list=new java.util.ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("aaa");
		list.add("aaa");
		list.add("aaa");
		list.add("aaa");
		list.add("����");
		list.add("bbb");
		list.add("����");
		list.add("aaa");
		LinkedHashSet<String> lk=new LinkedHashSet<>(list);
		System.out.println(lk);
	/*	for (int i = 0; i < list.size(); i++) {
			for (int j = i+1; j < list.size(); j++) {
					if (list.get(j).equals(list.get(i))) {
						list.remove(j);
						j--;
				}
			}
		}*/
		/*java.util.List<String> list1=new java.util.ArrayList<String>();
		for (String string : list) {
			if (!list1.contains(string)) {
				list1.add(string);
			}
		}*/
		//System.out.println(list);
	}

}
