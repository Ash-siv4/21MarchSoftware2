package com.qa.day1;

public class Hello2 {

	public static void h1() {
		System.out.println("Hello World - h1");
	}
	
	public static void h2(String fname, String sname) {
		System.out.println("Hello World " + fname + sname);
	}
	
	public static void h3() {
		String name = "thor";
		System.out.println("Hello World " + name);
	}
	
	public static String h4() {
		System.out.println("hi");
		return "Hello world - return";
	}
	
}
