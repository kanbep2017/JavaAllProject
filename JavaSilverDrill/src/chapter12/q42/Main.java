package chapter12.q42;

import chapter12.q42.a.A;
import chapter12.q42.b.B;

public class Main {

	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.x); // Aクラスのxを出力します。
		// 結果は "A" です。
		// BクラスのインスタンスをAクラスの型で参照
	}

}
