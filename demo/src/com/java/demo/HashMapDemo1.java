package com.java.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {
	public static void main(String[] agrs){
		Map<String,String> map=new HashMap<String,String>();
		map.put("zhan", "zhansan");
		map.put("li", "lisi");
		map.put("wang", "wangwu");
		map.put("zhan", "zhaoliu");
		Set<String> key=map.keySet();
/*		for (String str : key) {
			System.out.println(str+"---"+map.get(str));
		}
		Collection<String> value=map.values();
		for (String string : value) {
			System.out.println(string);
		}*/
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
	}
}
