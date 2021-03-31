package com.qa.day1;

public class Hello {

	public static void helloWorld(String str) {
//		String hello = "Hello world from hello";
//		int num = 48;
		System.out.println(str);
	}

	public static void method1() {
		System.out.println("method1");
	}

	public static void method2() {
		int a = 334;
		System.out.println(a);
	}

	public static void method3() {
		System.out.println("method3");
	}

	public static void runAll() {
		method1();
		method2();
		method3();
	}

}
