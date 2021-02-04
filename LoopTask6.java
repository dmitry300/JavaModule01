package by.jonline.training.main;

//. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class LoopTask6 {

	public static void main(String[] args) {

		int res;

		res = 0;

		for (int i = 1; i < 255; i++) {

			System.out.println(i + " : " + (char) i);

		}

		System.out.println(res);
	}

}
