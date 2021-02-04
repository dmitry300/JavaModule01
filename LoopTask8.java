package by.jonline.training.main;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class LoopTask8 {

	public static void main(String[] args) {

		int a = 2569;
		int b = 3652;
		int[] mas = new int[4];

		for (int i = 0; i < mas.length; i++) { // записали в массив значения цифр числа b.

			mas[i] = b % 10;
			b /= 10;

		}

		while (a != 0) {

			int res1 = a % 10;
			a /= 10;

			for (int i = 0; i < mas.length; i++) {

				if (res1 == mas[i]) {

					System.out.println(res1);

				}
			}
		}

	}
}
