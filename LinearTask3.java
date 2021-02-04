package by.jonline.training.main;

//(𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦)∗ 𝑡𝑔 𝑥

public class LinearTask3 {

	public static void main(String[] args) {

		double x;
		double y;
		double res;

		x = 5.5;
		y = 3.7;

		res = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

		System.out.println("res = " + res);

	}
}
