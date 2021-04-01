package com.qa.day2;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ------- Flowchart loop exercise --------
		FlowchartLoop.flow1();
		FlowchartLoop.flow2();
		FlowchartLoop.flow3();
		FlowchartLoop.flow4();

		// ------- Coins exercise --------
		Coins.change(4.58, 20);

		// calling a static method from another class
		Iteration.doWhile();

		// calling a non-static method from another class
//		Iteration abc = new Iteration();
//		abc.forloop(0);

		// ------------- Arrays & Array List -------------
		Arrays.array();
		Arrays.arrayLists();

		// ------------- Iteration -------------
		Iteration.forloop(13);
		Iteration.whileLoop1("Cust");
		Iteration.whileLoop2();
		Iteration.doWhile();

		// ------------- Conditionals -------------
		Conditionals.ifStat();
		Conditionals.switchCase(8);

	}

}
