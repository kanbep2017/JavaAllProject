package chapter12.q20;

public class Sample {
	private char a;
	private int b = 1;

	String test(char a, int b) {
		return a + ", " + b;
	}

	public static void main(String[] args) {
		Sample app = new Sample();
		//		System.out.println(app.test("A"));
		// (問題について)コンパイルエラーが発生します。
		// testメソッドは引数が2つ必要ですが、1つしか渡されていません。
		//		System.out.println(app.test("A", 1));
		// コンパイルエラーが発生します。
		// testメソッドはchar型とint型の引数を受け取りますが、
		System.out.println(app.test('A', 1));
		// 引数として文字列と整数を渡しています。
		// 正しい引数の型を渡すことで、メソッドは正常に呼び出されます。
	}

}
