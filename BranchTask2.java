package by.jonline.training.main;

import java.util.Scanner;

// Найти max{min(a, b), min(c, d)}.

public class BranchTask2 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double d;
		double min1; // минимум между a,b
		double min2; // минимум между c,d
		double max;

		a = scan(">> a = ");
		b = scan(">> b = ");
		c = scan(">> c = ");
		d = scan(">> d = ");

		if (a < b) {
			min1 = a;
		} else {
			min1 = b;
		}

		if (c < d) {
			min2 = c;
		} else {
			min2 = d;
		}

		if (min1 > min2) {
			max = min1;
		} else {
			max = min2;
		}

		System.out.print("max{min(a, b), min(c, d)} = " + max);
	}

	public static double scan(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double value;

		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print(message);
		}
		value = sc.nextDouble();

		return value;
	}
}
