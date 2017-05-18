package com.java.demo;

public class ThreedDemo1 {
	
	public static void main(String[] args) {
		Student4 student=new Student4("张三");
		StuPlay play=new StuPlay(student);
		StuStudy study=new StuStudy(student);
		play.start();
		study.start();
	}

}
class Student4{
	private static String name;
	boolean flag=true;

	public Student4(String name) {
		this.name = name;
	}
	public synchronized void play(){
		if (flag) {
			System.out.println(Thread.currentThread().getName()+name+"在玩");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			flag=false;
			notify();
		}else{
			try {
				
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	public synchronized void study(){
		if (!flag) {
			System.out.println(Thread.currentThread().getName()+name+"在学习");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			flag=true;
			notify();
		}else{
			try {
				
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
class StuPlay extends Thread{
	private Student4 student;
	
	public StuPlay(Student4 student) {
		super();
		this.student = student;
	}

	public void run() {
		while(true){	
			student.play();
		}
	}
}
class StuStudy extends Thread{
	private Student4 student;
	public StuStudy(Student4 student) {
		super();
		this.student = student;
	}

	public void run() {
		while(true){
			student.study();
		}
	}
}