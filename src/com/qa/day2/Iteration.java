package com.qa.day2;

public class Iteration {

	public static void forloop(int inp) { // inp=13
		// for(init;condition;iterator)
		for (int count = 0; count <= inp; count++) {// 1
			int times = inp * count; // 13 * 0 -> times
			System.out.println(inp + " * " + count + " = " + times);
		}
	}

	public static void whileLoop1(String a) { // a = Cust
		while (a == "Cust") {// true
			System.out.println("Customer CRUD");
			forloop(3);
			a = "Exit";
		}
	}

	public static void whileLoop2() {
		System.out.println("------------ while loop --------------");
		int num = 3;
		while (num < 3) {// false
			num++;
			System.out.println(num);
		}
	}

	public static void doWhile() {
		System.out.println("------------ do-while loop --------------");
		int val = 3;
		do {
			val++;
			System.out.println(val);
		} while (val < 3);
	}

}
