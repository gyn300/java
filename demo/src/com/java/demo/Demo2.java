package com.java.demo;

import java.util.Random;

public class Demo2 {

	public static void main(String[] args) {
		Worker woker=new Worker();
		Doctor doctor=new Doctor();
		try{
		woker.work();
		}catch(sickException e){
			doctor.cure(woker);
			if (woker.getStatus().equals("����")) {
				System.out.println("��ϲ��,����ָ�����");
			}else{
				System.out.println("sorry,������");
			}
		}
		finally{
			System.out.println("��ӭ�´�����");
		}
	}
}
class Worker{
	private String status;
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return status;
	}
	public void work()throws sickException{
		Random random=new Random();
		int r=random.nextInt(3)+1;
		if (r==1) {
			throw new sickException("������");
		}else{
			System.out.println("���彡��,��������");
		}
	}
}
class sickException extends Exception{
	private String message;
	public sickException(String message){
		this.message=message;
	}
	public String getMessage(){
		return message;
	}
}
class Doctor{
	public void cure(Worker worker){
		Random random=new Random();
		int r=random.nextInt(3)+1;
		if (r==1) {
			worker.setStatus("����");
		}else{
			worker.setStatus("����");
		}
	}
}
