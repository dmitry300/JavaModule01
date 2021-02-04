package by.jonline.training.main;

import java.util.Scanner;

/*
 *  Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
 *  Определить, будут ли они расположены на одной прямой
 */

public class BranchTask3 {

	public static void main(String[] args) {

		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;

		x1 = scan(">> x1 = ");
		y1 = scan(">> y1 = ");
		x2 = scan(">> x2 = ");
		y2 = scan(">> y2 = ");
		x3 = scan(">> x3 = ");
		y3 = scan(">> y3 = ");

		if ((x2 - x1) / (x3 - x1) == (y2 - y1) / (y3 - y1)) {
			System.out.print("Данные три точки будут лежать на одной прямой.");
		} else {
			System.out.print("Данные три точки НЕ будут лежать на одной прямой.");
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
