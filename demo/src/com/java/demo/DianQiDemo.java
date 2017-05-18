package com.java.demo;

public class DianQiDemo {

	public static void main(String[] args) {
		Person3 p=new Person3("张三");
		Appliance light=new Light("电灯");
		Appliance television=new Light("电视机");
		Appliance fan=new Light("电扇");
		p.openAppliance(light);
		p.openAppliance(television);
		p.openAppliance(fan);
		Appliance [] app={light,television,fan};
		for (int i = 0; i < app.length; i++) {
			if (app[i] instanceof Light) {
				app[i]=(Light)app[i];
			}else if(app[i] instanceof Television ){
				app[i]=(Television)app[i];
			}else if(app[i] instanceof Fan){
				app[i]=(Fan)app[i];
			}
		}
	}

}
class Person3{//人
	private String name;
	public Person3(String name) {
		this.name = name;
	}
	public void openAppliance(Appliance appliance){//打开电器方法
		System.out.println(name+"打开了"+appliance);
		appliance.run();
	}
	
}
class Appliance{//电器类
	private String name;

	public Appliance(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString(){
		return name;
	}
	public void run(){
		System.out.println(name+"正在工作");
	}
	
}
class Light extends Appliance{//电灯类继承电器

	public Light(String name) {
		super(name);
	}
	
}
class Television extends Appliance{//电视机类继承电器
	public Television(String name) {
		super(name);
	}
}
class Fan extends Appliance{//电扇类继承电器

	public Fan(String name) {
		super(name);
	}
	
}