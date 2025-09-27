package chapter5.q8;

public class Main {

	public static void main(String[] args) {
		String[][] array = { { "A", "B" }, null, { "C", "D", "E" } };
		int total = 0;
		for (String[] tmp : array) {
			total += tmp.length; // tmpがnullの場合、NullPointerExceptionが発生する
			// 解説
			// tmpがnullの場合、NullPointerExceptionが発生します。
			// この場合、tmp.lengthを参照しようとすると、nullオブジェクトに対してメソッドを呼び出そうとしているためです。
			// もしNullPointerExceptionを回避したい場合は、tmpがnullでないことを確認してからlengthを参照する必要があります。
			// 例: if (tmp != null) { total += tmp.length; }
			// コンパイルエラーは発生しませんが、実行時にNullPointerExceptionが発生します。
		}
		System.out.println(total); // この行は実行されない
	}

}
