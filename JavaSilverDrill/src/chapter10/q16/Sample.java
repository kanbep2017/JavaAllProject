package chapter10.q16;

import static java.time.DayOfWeek.*;

import java.time.LocalDate;

public class Sample {

	public static void main(String[] args) {
		var today = LocalDate.now().with(TUESDAY).getDayOfWeek(); // TUESDAYはDayOfWeekの定数
		switch (today) {
		case SUNDAY:
		case SATURDAY:
			System.out.println("weekend");
			break;
		case MONDAY:
			FRIDAY: System.out.println("working");
		default:
			System.out.println("other");
		}
		// 出力は "other" となる
	}

}
