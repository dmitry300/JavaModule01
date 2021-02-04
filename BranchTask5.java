package by.jonline.training.main;

import java.util.Scanner;

/*
 * Вычислить значение функции: 
	F(x) = x^2-3x+9, если x<=3,
	F(x) = 1/x^3+6, если x>3,
 */

public class BranchTask5 {

	public static void main(String[] args) {

		double x;
		double y;

		x = scan(">> x = "); // инициализуруем x

		if (x <= 3) {

			y = Math.pow(x, 2) - 3 * x + 9;

			System.out.println("F(x) = " + y + " при x <= 3");

		} else {

			y = 1 / (Math.pow(x, 3) + 6);

			System.out.println("F(x) = " + y + " при x > 3");

		}

	}

	public static double scan(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double value;

		System.out.print(message);

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println(message);
		}

		value = sc.nextDouble();

		return value;
	}
}
