package com.java.demo;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] agrs) {
		int b=1;
		float a=b;
		byte c=(byte) b;
		InternetBar i = new InternetBar();
		try {
			i.netPlay();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
}

class MyException extends Exception {
	private String message;

	public MyException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

class InternetBar {
	public void netPlay() throws MyException {
		Scanner input = new Scanner(System.in);
		System.out.println("�������������");
		int age = 0;
		while (true) {
			try {
				age = input.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("��������,����������");
				input.nextLine();
			}
		}
		if (age > 17) {
			System.out.println("��ӭ����");
		} else {
			throw new MyException("δ��18��,���ý���");
		}
	}
}