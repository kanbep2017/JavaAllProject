package chapter9.q6;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Sample {

	public static void main(String[] args) {
		LocalDate a = LocalDate.of(2019, 8, 19);
		LocalDate b = LocalDate.of(2019, 8, 20);
		b.with(DayOfWeek.MONDAY); // withメソッドは新しいLocalDateを返すが、bは変更されない。
		System.out.println(a.equals(b) + ", " + a.isBefore(b)); // aとbは異なる日付なので、equalsはfalseを返す。aはbより前の日付なので、isBeforeはtrueを返す。
	}
}
