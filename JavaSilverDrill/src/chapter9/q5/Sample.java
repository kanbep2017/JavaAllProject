package chapter9.q5;

import java.time.LocalDate;

public class Sample {

	public static void main(String[] args) {
		LocalDate a = LocalDate.of(2015, 0, 1); // Note: 月は1から始まる。Calendarは0から始まる。コンパイルエラーにはならず、例外が発生する。
		LocalDate b = LocalDate.parse("2015-01-01");
		System.out.println(a.equals(b));
	}
}
