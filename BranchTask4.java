package by.jonline.training.main;

import java.util.Scanner;

/*
 *  Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
 *  Определить, пройдет ли кирпич через отверстие
 */

public class BranchTask4 {

	public static void main(String[] args) {

		double a; // объявление, a,b-размеры отверстия
		double b;
		double x; // x,y,z - размеры кирпича
		double y;
		double z;

		a = scan(">> a = "); // инициализация, считываем размеры с консоли
		b = scan(">> b = ");
		x = scan(">> x = ");
		y = scan(">> y = ");
		z = scan(">> z = ");

		if ((x < a && y < b) || (y < a && x < b) || (z < a && y < b) || (z < a && x < b) || (z < b && x < a)// вращаем в
																											// уме
																											// кирпич
				|| (z < b && y < a)) { // и формулируем условия
			System.out.println("Кирпич пролезет в отверстие, отвечая заданным размерам.");
		} else {
			System.out.println("Кирпич Не пролезет в отверстие, отвечая заданным размерам!");
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
