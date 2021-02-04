package by.jonline.training.main;

import java.util.Scanner;

//. Даны два угла треугольника (в градусах). 
//  Определить, существует ли такой треугольник,
//  и если да, то будет ли он прямоугольным.

public class BranchTask1 {

	public static void main(String[] args) {

		int arc1;
		int arc2;
		int arc3;

		arc1 = scan(">> arc1: ");
		arc2 = scan(">> arc2: ");
		arc3 = 180 - (arc1 + arc2);

		if (arc1 + arc2 < 180 && arc1 > 0 && arc2 > 0) {

			if (arc1 == 90 || arc2 == 90 || arc3 == 90) {

				System.out.println("Такой треугольник будет прямоугольным.");

			} else {

				System.out.println("Такой треугольник НЕ будет прямоугольным.");

			}
		} else {

			System.out.println("Такого треугольника не существует.");

		}
	}

	public static int scan(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int value;

		System.out.print(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}

		value = sc.nextInt();

		return value;
	}
}
