package chapter9.q12;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		for (String str : list) { // Aのみが出力される。
			if ("B".equals(str)) {
				list.remove(str); // Bが削除された位置にCが来る。
				// 次の要素に行こうとするが、Cが最後なので拡張for文を抜ける。
			} else {
				System.out.println(str);
			}
		}
	}

}
