package com.qa.iteration;

public class Coins {
	public static void main(String[] args) {
		change(11.79, 80.00);

	}

	public static void change(double cost, double cash) {
		System.out.println("the total is £" + cost);
		double change = (cash - cost);
		System.out.println("Your change is £" + change);

		int fiftypounds = 0;
		int twentypounds = 0;
		int tenpounds = 0;
		int fivepounds = 0;
		int twopounds = 0;
		int onepound = 0;
		int fiftyp = 0;
		int twentyp = 0;
		int tenp = 0;
		int fivep = 0;
		int twop = 0;
		int onep = 0;

		while (change >= 50.00) {
			change -= 50;
			fiftypounds++;
		}
		while (change >= 20.00) {
			change -= 20;
			twentypounds++;
		}
		while (change >= 10.00) {
			change -= 10;
			tenpounds++;
		}
		while (change >= 05.00) {
			change -= 5;
			fivepounds++;
		}
		while (change >= 02.00) {
			change -= 2;
			twopounds++;
		}
		while (change >= 01.00) {
			change -= 1;
			onepound++;
		}
		while (change >= 0.50) {
			change -= 0.50;
			fiftyp++;
		}
		while (change >= 0.20) {
			change -= 0.20;
			twentyp++;
		}
		while (change >= 0.10) {
			change -= 0.10;
			tenp++;
		}
		while (change >= 0.05) {
			change -= 0.05;
			fivep++;
		}
		while (change >= 0.02) {
			change -= 0.02;
			twop++;
		}
		while (change >= 0.01) {
			change -= 0.01;
			onep++;
		}

		System.out.println(fiftypounds + " £50");
		System.out.println(twentypounds + " £20");
		System.out.println(tenpounds + " £10");
		System.out.println(fivepounds + " £5");
		System.out.println(onepound + " £1");
		System.out.println(fiftyp + " 50p");
		System.out.println(twentyp + " 20p");
		System.out.println(tenp + " 10p");
		System.out.println(fivep + " 5p");
		System.out.println(twop + " 2p");
		System.out.println(onep + " 1p");

	}
}
