package com.qa.iteration;

public class Flowchart5 {

	public static void main(String[] args) {
		forLoop();
	}

	public static void forLoop() {
		int times = 1;
		for (int number = times; number <= 10; number++) {
			for (int j = 0; j < number; j++) {
				System.out.println(+number);
			}
		}
	}

}
