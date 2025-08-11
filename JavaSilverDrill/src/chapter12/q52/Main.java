package chapter12.q52;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 1, 2, 4, 5, 3 };
		int result1 = Arrays.mismatch(array1, array2); // 0番目から比較していき、最初に異なる要素のインデックスを返す
		int result2 = Arrays.compare(array1, array2); // 配列の比較を行い、同じなら0、異なるなら非0の値を返す
		System.out.println(result1 + ":" + result2); // 出力結果は "2:-1" です。
	}
}
