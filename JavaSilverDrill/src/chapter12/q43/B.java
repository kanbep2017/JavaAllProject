package chapter12.q43;

public class B extends A {

	public int test(int num) {
		if (isValue(num)) {
			return num;
		}
		return 0;
	}

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.test(10));
		// (問題について)isValueメソッドはprivateであるため、
		// Bクラスのtestメソッドからは呼び出せません。
		// コンパイルエラーが発生します。
		// もしisValueメソッドを呼び出したい場合は、
		// AクラスのisValueメソッドをpublicに変更するか、
		// Bクラス内でisValueメソッドをオーバーライドする必要があります。
		// AクラスのisValueメソッドをpublicに変更すると、
		// BクラスのtestメソッドからisValueメソッドを呼び出すことができます。
		// 結果は "10" です。
	}

}
