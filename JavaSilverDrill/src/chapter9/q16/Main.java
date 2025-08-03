package chapter9.q16;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] a = { "B", "A" };
		String[] b = { "A", "B" };
		System.out.println(Arrays.compare(a, b)); // 最初の一番目を比較して、左のほうが小さい場合は負、右のほうが小さい場合は正を返す。
	}

}
