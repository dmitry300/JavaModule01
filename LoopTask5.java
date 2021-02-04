package by.jonline.training.main;

/*
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид:
 */

public class LoopTask5 {

	public static void main(String[] args) {

		int res;

		res = 0;

		for (int i = 1; i <= 200; i++) {

			res *= i * i;

		}

		System.out.println(res);
	}
}
