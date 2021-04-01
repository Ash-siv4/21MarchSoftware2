package com.qa.day2;

public class Conditionals {

	public static void ifStat() {
		int temp = 45;
		if (temp > 30 && temp < 40) {
			System.out.println("hot");
		} else if (temp > 40) {
			System.out.println("really hot");
		} else {
			System.out.println("cold");
		}
	}

	public static void switchCase(int day) {
//		int day = 3;

		switch (day) {
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tues");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thurs");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sun");
			break;
		default:
			System.out.println("not a day");
		}
	}

}
