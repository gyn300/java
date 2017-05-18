package com.java.demo;

public class DemoText {

	public static void main(String[] args) {
		Son s=new Son("阿三",16,"清华");
		System.out.println(s);
		
	}

}
class Father{
	private String name;
	private int age;
	public Father(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public final int getAge() {
		return age;
	}
	public void  setAge(int age) {
		this.age = age;
	}
	
	
}
class Son extends Father{
	private String school;
	public Son(String name, int age,String school) {
		super(name, age);
		this.school=school;
	}
	public void goSchool(){
		System.out.println("走路去上学");
	}
	
	public String getSchool() {
		return school;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((school == null) ? 0 : school.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Son other = (Son) obj;
		if (school == null) {
			if (other.school != null)
				return false;
		} else if (!school.equals(other.school))
			return false;
		return true;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return this.getName()+"今年"+this.getAge()+"岁"+"在"+school+"上学";
	}
	
	
	
}