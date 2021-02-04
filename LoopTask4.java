package by.jonline.training.main;

//Составить программу нахождения произведения квадратов первых двухсот чисел.

public class LoopTask4 {

	public static void main(String[] args) {

		int res;

		res = 0;

		for (int i = 1; i <= 200; i++) {

			res *= i * i;

		}

		System.out.println(res);
	}

}
