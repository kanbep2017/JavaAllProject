package chapter9.q17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(
				Arrays.asList(new String[] { "A", "B", "C" }) // Arrays.asListで固定長のリストを作成
		); // List型の変数listは可変長である。
		// Arrays.asListで作成したリストは固定長（要素の追加・削除は不可、変更は可）
		// しかしnew ArrayList<>(...)でラップすることで可変長リストになる（追加・削除が可能）
		list.removeIf((String s) -> {
			return s.equals("B"); // "B"を削除する
		});
		System.out.println(list); // [A, C]が出力される

	}

}