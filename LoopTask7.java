package by.jonline.training.main;

import java.util.Scanner;

/*
 *  Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */

public class LoopTask7 {

	public static void main(String[] args) {

		int m;
		int n;

		m = scan("m: ");
		n = scan("n: ");

		for (int i = m; i <= n; i++) {

			for (int j = 2; j < n; j++) {

				if (i % j == 0 && i != j) {

					System.out.println("Делители для числа " + i + " : " + j);
				}
			}
		}
	}

	public static int scan(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int value;

		System.out.print(message);

		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print(message);
		}

		value = sc.nextInt();

		return value;
	}

}
