package chapter12.q31;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		var alphabet = new ArrayList<>(
				Arrays.asList(
						new String[] { "A", "B", "C", "D", "E" }
				// 文字列の配列をArrayListに変換
				));
		alphabet.sort((var a, var b) -> -a.compareTo(b)); // 逆順にソート
		alphabet.forEach(System.out::println);
	}

}
