package com.qa.day2;

import java.util.ArrayList;

public class Arrays {

	public static void array() {
		// Normal arrays are static so you have to define what will be in the array
		int age1 = 25;
		Integer agex = 47;
		int age2 = 23;
		int age3 = 54;
		int age4 = 26;
		System.out.println(age3);

		// ------- single-dimensional array -------
		String[] name = { "bob", "peter", "martin" }; //string array
		//       col:  0   1   2   3   4
		int[] age = { 25, 23, 54, 26, 43 };
		// the above creates a single line array of : 25 23 54 26 43

		System.out.println(age[3]); //prints out the number at index=3 in the age array

		System.out.println("Age array length = " + age.length);
		
		// ------------------- Normal for-loop -------------------
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]); // print everything in the array using normal for loop
		}

		// ------------------- Enhanced for-loop a.k.a for-each loop -------------------
		for (int a : age) {
			System.out.println(a); // print everything in the array with a for-each loop
		}	

		// ------- multi-dimensional array -------
		int[][] height = { { 25, 23, 54, 26 }, { 2, 3, 4, 6 } };
		
		// col         0   1   2   3
		// row 0      25  23  54  26
		// row 1       2   3   4   6
		
		//                     [row][col]
		System.out.println(height[1][2]);
	}
	
	

	public static void arrayLists() {
		// Array Lists are dynamic
		ArrayList<Integer> arr = new ArrayList<>();

		System.out.println("size: " + arr.size());
		arr.add(23); // add values to the array - 0
		arr.add(53); // add values to the array - 1
		arr.add(765); // add values to the array - 2
		System.out.println("new size: " + arr.size());
		System.out.println(arr.get(2));
		arr.remove(1);
		System.out.println("new size after remove: " + arr.size());
		System.out.println(arr.get(2));
	}
}
