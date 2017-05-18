package com.java.demo;

public class CarDemo {

	public static void main(String[] args) {
		Car tractor=new Tractor("拖拉机");
		Car truck=new Truck("卡车");
		Car saloon=new Saloon("小轿车");
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
		System.out.println("拖拉机缓慢前进");
	}
	
}
class Truck extends Car{

	public Truck(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("卡车在公路上行驶");
	}
	
}
class Saloon extends Car{

	public Saloon(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("小轿车在高速公路飞驰");
	}
	
}