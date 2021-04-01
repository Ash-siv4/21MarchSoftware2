package com.qa.day2;

public class FlowchartLoop {
	public static void flow1() {
		for (int A = 100; A <= 200; A++) {
			System.out.println(A);
		}
	}

	public static void flow2() {
		for (int A = 100; A <= 200; A++) {
			if (A % 2 == 0) {
				System.out.println("-" + A);
			} else {
				System.out.println("*" + A);
			}
		}
	}

	public static void flow3() {
		for (int num = 1; num <= 10; num++) {
			for (int rep = 0; rep < 10; rep++) {
				System.out.println(num);
//				System.out.println(num + " : "+ rep);
			}
		}
	}

	public static void flow4() {
		for (int num = 1; num <= 10; num++) {
			for (int rep = 0; rep < num; rep++) {
				System.out.println(num);
			}
		}
	}

}
