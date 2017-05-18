package com.java.demo;

public class DianQiDemo {

	public static void main(String[] args) {
		Person3 p=new Person3("����");
		Appliance light=new Light("���");
		Appliance television=new Light("���ӻ�");
		Appliance fan=new Light("����");
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
class Person3{//��
	private String name;
	public Person3(String name) {
		this.name = name;
	}
	public void openAppliance(Appliance appliance){//�򿪵�������
		System.out.println(name+"����"+appliance);
		appliance.run();
	}
	
}
class Appliance{//������
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
		System.out.println(name+"���ڹ���");
	}
	
}
class Light extends Appliance{//�����̳е���

	public Light(String name) {
		super(name);
	}
	
}
class Television extends Appliance{//���ӻ���̳е���
	public Television(String name) {
		super(name);
	}
}
class Fan extends Appliance{//������̳е���

	public Fan(String name) {
		super(name);
	}
	
}