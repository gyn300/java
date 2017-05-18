package com.java.demo;

public class CarDemo {

	public static void main(String[] args) {
		Car tractor=new Tractor("������");
		Car truck=new Truck("����");
		Car saloon=new Saloon("С�γ�");
		tractor.run();
		truck.run();
		saloon.run();
	}

}
interface M{
	public default void cam(){};
}
abstract class Car{
	private String name;
	
	public Car(String name) {
		super();
		this.name = name;
	}

	public abstract void run();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
class Tractor extends Car{

	public Tractor(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("����������ǰ��");
	}
	
}
class Truck extends Car{

	public Truck(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("�����ڹ�·����ʻ");
	}
	
}
class Saloon extends Car{

	public Saloon(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("С�γ��ڸ��ٹ�·�ɳ�");
	}
	
}