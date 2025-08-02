package chapter9.q13;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		// 拡張for文でリストの要素を削除しようとすると、ConcurrentModificationExceptionが発生します。
		// ここからコメントアウトしてください。
		for (String str : list) {
			if ("C".equals(str)) {
				list.remove(str);
			}
		}

		for (String str : list) { // ConcurrentModificationExceptionが発生する。
			System.out.println(str);
		}
		// ここまでコメントアウトしてください。

		// 例外が発生しないようにするには、Iteratorを使用する。
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			if ("C".equals(str)) {
				iterator.remove(); // Iteratorのremoveメソッドを使用して要素を削除する。
			}
		}

		for (String str : list) { // Cが削除された状態で出力される。
			System.out.println(str);
		}
	}

}
