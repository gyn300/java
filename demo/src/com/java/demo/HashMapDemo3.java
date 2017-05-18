package com.java.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo3 {

	public static void main(String[] args) {
		String[] strs={"zhangsan","lisi","lisi",
				"wangwu","zhaoliu","zhaoliu"};
		Countstr.print(Countstr.countstr(strs));
		
	}
	
}
class Countstr{
	public static Map<String, Integer> countstr(String[] strs){
		Map<String, Integer> data=new HashMap<String,Integer>();
		String str;
		for (int i = 0; i < strs.length; i++) {
			str=strs[i];
			if (data.get(str)==null) {
				data.put(str, 1);
			}else{
				data.put(str, data.get(str)+1);
			}
		}
		return data;
	}
	public static void print(Map<String, Integer> data){
		Set<Entry<String, Integer>> entrySet = data.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
	}
}
