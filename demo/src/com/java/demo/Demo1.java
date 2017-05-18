package com.java.demo;

import java.util.Random;
import java.util.Scanner;

public class Demo1 {
	static String[] name_arr = { "tom", "jay", "lili", null, null };
	static String[] pwd_arr = { "t123", "j123", "l123", null, null };

	public static void main(String[] args) {
		movie();
	}

	public static void movie() {
		showView();//欢迎界面
		int choise;//选择
		do {//输入错误循环
			choise = getChoise();
			switch (choise) {
			case 1:
				login();//登陆
				break;
			case 2:
				register();//注册
				break;
			case 3:
				System.out.println("谢谢使用");
				break;
			default:
				System.out.println("输入有误,请重新输入");
				break;
			}
		} while (choise > 3 || choise < 1);
	}

	/**
	 * 注册
	 */
	public static void register() {
		System.out.println("欢迎来到注册界面");
		System.out.println("请输入要注册的账号");
		String name = getName();
		String getCode;//输入的验证码
		String setCode;//获得的验证码
		for (int i = 0; i < name_arr.length; i++) {
			if (name_arr[i] != null) {
				if (name.equals(name_arr[i])) {
					System.out.println("账号已存在");
					break;
				}
			} else {
				name_arr[i] = name;
				System.out.println("请输入密码");
				pwd_arr[i] = getPwd();
				setCode = setCode();//获得验证码
				System.out.println("请输入验证码" + setCode);
				getCode = getCode();//输入验证码
				if (getCode.equals(setCode)) {
					System.out.println("注册成功");
					break;
				} else {
					System.out.println("验证码错误");
					break;
				}
			}
		}
	}

	/**
	 * 登录
	 */
	public static void login() {
		System.out.println("请输入账号");
		String name = getName();
		String pwd;
		String getCode;//输入的验证码
		String setCode;//获得的验证码
		for (int i = 0; i < name_arr.length; i++) {
			if (name_arr[i] != null) {
				if (name.equals(name_arr[i])) {
					System.out.println("请输入密码");
					pwd = getPwd();
					setCode = setCode();//获得验证码
					System.out.println("请输入验证码" + setCode);
					getCode = getCode();//输入验证码
					if (pwd.equals(pwd_arr[i]) && setCode.equals(getCode)) {
						System.out.println("登录成功");
						break;
					} else {
						System.out.println("密码或者验证码错误");
						break;
					}
				}

			} else {
				System.out.println("账号不存在");
				break;
			}
		}
	}

	/**
	 * 获得账号
	 * 
	 */

	public static String getName() {
		Scanner input = new Scanner(System.in);
		return input.next();
	}

	/**
	 * 获得密码
	 * 
	 */
	public static String getPwd() {
		Scanner input = new Scanner(System.in);
		return input.next();
	}

	/**
	 * 获得验证码
	 * 
	 */
	public static String setCode() {
		char[] arr = new char[62];
		Random random = new Random();
		int index;
		String code = "";
		for (int i = 0; i < 10; i++) {
			arr[i] = (char) (i + 48);
		}
		for (int i = 10; i < 36; i++) {
			arr[i] = (char) (i + 55);
		}
		for (int i = 36; i < arr.length; i++) {
			arr[i] = (char) (i + 61);
		}
		for (int i = 0; i < 4; i++) {
			index = random.nextInt(62);
			code += arr[index];
		}
		return code;
	}

	/**
	 * 输入验证码
	 */
	public static String getCode() {
		Scanner input = new Scanner(System.in);
		return input.next();
	}

	/**
	 * 欢迎界面
	 */
	public static void showView() {
		System.out.println("欢迎来到登录注册界面");
		System.out.println("1.登录");
		System.out.println("2.注册");
		System.out.println("3.退出");
		System.out.println("请选择");
	}

	/**
	 * 获得选择
	 */
	public static int getChoise() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
}