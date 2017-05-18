package com.java.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonDemo {

	public static void main(String[] args) {
		Printer bp=new BlackPrinter("戴尔");
		School s=new School();
		Teacher t=new Teacher("zhansan",18);
		s.getPrinter(bp);
		s.print(t);
		System.out.println(t.date());
	}

}
interface IInfo{
	String detail();
}
class School implements IInfo{
	private Printer p=null;
	public void getPrinter(Printer p){
		this.p=p;
	}
	public void print(IInfo info){
		p.print(info.detail());
	}
	public String detail(){
		return "这里是海通科技";
	}
}
class Printer{
	private String brand;
	public Printer(String brand){
		this.brand=brand;
	}
	public void print(String content){
		
	}
	public String getBrand(){
		return brand;
	}

}
class ColorPrinter extends Printer{
	public ColorPrinter(String brand){
		super(brand);
	}
	public void print(String content){
		System.out.println(getBrand()+"彩色打印"+content);
	}
}
class BlackPrinter extends Printer{
	public BlackPrinter(String brand){
		super(brand);
	}
	public void print(String content){
		System.out.println(getBrand()+"黑白打印"+content);
	}
}
class Teacher implements IInfo{
	private String name;
	private int age;
	public Teacher(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	public String detail(){
		return "我叫"+name+",今年"+age+"岁";
	}
	public String date(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		return sdf.format(date);
	}
}
