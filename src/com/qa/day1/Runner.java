package com.qa.day1;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World"); // straight from runner

		Hello2.h1(); // no parameters

		Hello2.h2("iron man", "3"); // takes in a parameter

		Hello2.h3(); // no parameter but prints a variable

		Hello2.h4();

//		System.out.println(Hello2.h4());

		// class names are in PascalCase
		// variables are named in camelCase
		// snake_case - constants - final
		int num = 4;
		String str = "hiiii";
		float price = 5f; // 5.0
		boolean bool = true;
		char myLetter = 'd';
		double doub = 232;
		long l = 64l;

	}

}

// COMMENT - shortcut: sysout then control + space
//		System.out.println("Hello World");
//
//		int age = 25;
//		System.out.println(age);

//		Hello.helloWorld("i am iron man");
//		Hello.method1();
//		Hello.method2();
//		Hello.method3();
//		Hello.runAll();
