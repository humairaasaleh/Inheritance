package com.qa.iteration;

public class Flowchart3 {
	public static void main(String[] args) {
		forLoop();
	}

	public static void forLoop() {
		int targetCount = 10;
		for (int number = 1; number <= 10; number++) {
			for (int count = 1; count <= targetCount; count++) {
				System.out.println(+count);
			}
		}

	}

}
