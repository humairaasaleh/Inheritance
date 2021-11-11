package com.qa.iteration;

public class Flowchart2 {

	public static void main(String[] args) {
		oddOrEven();
	}

	public static void  oddOrEven() {
		for (int A = 100; A <= 200; A++) {
			if (A % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}

	}

}
