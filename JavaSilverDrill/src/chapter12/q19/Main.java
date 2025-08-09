package chapter12.q19;

public class Main {
	// 日本語で解説を書いてください
	public static void main(String[] args) {
		A a = new B();
		a.bye(); // コンパイルエラーが発生します。
		// AクラスのインスタンスをBクラスの型で参照しているため、
		// Bクラスのメソッドは呼び出せません。
	}
}
