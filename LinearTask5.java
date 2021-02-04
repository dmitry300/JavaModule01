package by.jonline.training.main;

/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 *Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
*/

public class LinearTask5 {

	public static void main(String[] args) {

		int time;
		int hour;
		int minute;
		int sec;

		time = 10206;
		hour = time / 60 / 60;
		minute = time / 60 - (hour * 60);
		sec = time - (minute * 60) - (hour * 60 * 60);

		System.out.println(hour + "ч " + minute + "мин " + sec + "с ");
	}
}
