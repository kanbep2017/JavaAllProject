package chapter12.q46;

import java.time.LocalDate;

public class Diary {
	private LocalDate now = LocalDate.now(); // 現在の日付を取得します。

	public LocalDate getNow() {
		return this.now; // 現在の日付を返します。
	}
}
