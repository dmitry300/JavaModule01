package by.jonline.training.main;

import java.util.Scanner;

/*
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.
 */

public class LoopTask1 {

	public static void main(String[] args) {

		int a; // любое целое положительное
		int res;// переменная для суммирования

		res = 0;
		a = scan(">>");

		for (int i = 1; i <= a; i++) {

			res += i;
		}

		System.out.println("Сумма = " + res);

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
