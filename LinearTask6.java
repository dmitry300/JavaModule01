package by.jonline.training.main;

import java.util.Scanner;

/*
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:
 */

public class LinearTask6 {

	public static void main(String[] args) {

		double x;
		double y;

		x = scan(">> x = ");

		y = scan(">> y = ");

		if ((x > -2 && x < 2 && y > -3 && y < 4) || (x > -4 && x < 4 && y > -3 && y < 0)) { // ó÷èòûâàÿ, ÷òî ãðàíèöû íå
																							// âõîäÿò
			System.out.print("True");
		} else {
			System.out.print("False");
		}

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
