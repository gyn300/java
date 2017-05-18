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
		System.out.println("请输入你的年龄");
		int age = 0;
		while (true) {
			try {
				age = input.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("输入有误,请重新输入");
				input.nextLine();
			}
		}
		if (age > 17) {
			System.out.println("欢迎光临");
		} else {
			throw new MyException("未满18岁,不得进入");
		}
	}
}