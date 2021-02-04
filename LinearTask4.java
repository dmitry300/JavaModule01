package by.jonline.training.main;

/* Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.*/

public class LinearTask4 {

	public static void main(String[] args) {

		double x;
		double res;

		x = 503.936;

		res = x * 1000 - Math.floor(x) * 1000 + Math.floor(x) / 1000;

		System.out.println("res = " + res);

	}
}
