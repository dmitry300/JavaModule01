package by.jonline.training.main;

//b + sqrt(b*b +4*a*c))/(2*a)-a^3*c+b^-2;

public class LinearTask2 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double res;

		a = 2.4;
		b = 6.8;
		c = 3.9;

		res = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.println("d = " + res);

	}
}
