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
		showView();//��ӭ����
		int choise;//ѡ��
		do {//�������ѭ��
			choise = getChoise();
			switch (choise) {
			case 1:
				login();//��½
				break;
			case 2:
				register();//ע��
				break;
			case 3:
				System.out.println("ллʹ��");
				break;
			default:
				System.out.println("��������,����������");
				break;
			}
		} while (choise > 3 || choise < 1);
	}

	/**
	 * ע��
	 */
	public static void register() {
		System.out.println("��ӭ����ע�����");
		System.out.println("������Ҫע����˺�");
		String name = getName();
		String getCode;//�������֤��
		String setCode;//��õ���֤��
		for (int i = 0; i < name_arr.length; i++) {
			if (name_arr[i] != null) {
				if (name.equals(name_arr[i])) {
					System.out.println("�˺��Ѵ���");
					break;
				}
			} else {
				name_arr[i] = name;
				System.out.println("����������");
				pwd_arr[i] = getPwd();
				setCode = setCode();//�����֤��
				System.out.println("��������֤��" + setCode);
				getCode = getCode();//������֤��
				if (getCode.equals(setCode)) {
					System.out.println("ע��ɹ�");
					break;
				} else {
					System.out.println("��֤�����");
					break;
				}
			}
		}
	}

	/**
	 * ��¼
	 */
	public static void login() {
		System.out.println("�������˺�");
		String name = getName();
		String pwd;
		String getCode;//�������֤��
		String setCode;//��õ���֤��
		for (int i = 0; i < name_arr.length; i++) {
			if (name_arr[i] != null) {
				if (name.equals(name_arr[i])) {
					System.out.println("����������");
					pwd = getPwd();
					setCode = setCode();//�����֤��
					System.out.println("��������֤��" + setCode);
					getCode = getCode();//������֤��
					if (pwd.equals(pwd_arr[i]) && setCode.equals(getCode)) {
						System.out.println("��¼�ɹ�");
						break;
					} else {
						System.out.println("���������֤�����");
						break;
					}
				}

			} else {
				System.out.println("�˺Ų�����");
				break;
			}
		}
	}

	/**
	 * ����˺�
	 * 
	 */

	public static String getName() {
		Scanner input = new Scanner(System.in);
		return input.next();
	}

	/**
	 * �������
	 * 
	 */
	public static String getPwd() {
		Scanner input = new Scanner(System.in);
		return input.next();
	}

	/**
	 * �����֤��
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
	 * ������֤��
	 */
	public static String getCode() {
		Scanner input = new Scanner(System.in);
		return input.next();
	}

	/**
	 * ��ӭ����
	 */
	public static void showView() {
		System.out.println("��ӭ������¼ע�����");
		System.out.println("1.��¼");
		System.out.println("2.ע��");
		System.out.println("3.�˳�");
		System.out.println("��ѡ��");
	}

	/**
	 * ���ѡ��
	 */
	public static int getChoise() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
}