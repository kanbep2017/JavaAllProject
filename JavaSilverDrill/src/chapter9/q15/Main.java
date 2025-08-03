package chapter9.q15;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] a = { "b", "c" };
		String[] b = { "a", "b", "c" };
		System.out.println(Arrays.mismatch(a, b)); // ミスマッチの最初の位置を返す（0からスタート）。答えは0。
	}

}
