package by.jonline.training.main;

import java.util.Scanner;

/*
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 * y = x при x > 2,
 * y = -x при x <= 2.
 */

public class LoopTask2 {

	public static void main(String[] args) {

		double a;
		double b;
		double h;
		double y;

		a = scan(">> a = ");
		b = scan(">> b = ");
		h = scan(">> h = ");

		if (a <= 2 && b <= 2) { // если промежуток левее 2ух, то выполнятся сл цикл

			for (double i = h; i <= Math.abs(a) + Math.abs(b); i += h) { // i сохраняет в себе число шага
				y = (a + i) * (-1);
				System.out.println("y = " + y);
			}
		} else {

			for (double i = h; i <= b - a; i += h) {
				y = a + i;
				System.out.println("y = " + y);
			}
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
