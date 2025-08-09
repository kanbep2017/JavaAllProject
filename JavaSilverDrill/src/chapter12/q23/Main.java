package chapter12.q23;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		A a1 = new A(); // a1はA型で中身もA。Aのsampleが呼ばれる。
		A a2 = new B(); // a2はA型だが中身はB。Bでオーバーライドされたsampleが呼ばれる（動的バインディング）。
		B b1 = new B(); // b1はB型で中身もB。Bのsampleが呼ばれる。

		List<String> list = new ArrayList<>();

		// do something
		// 選択肢A: 変数も中身もAなのでAのsampleが呼ばれる
		a1.sample(list); // 出力: A
		// 選択肢B: 変数はA型だが中身はBなのでBのsampleが呼ばれる（オーバーライド）
		a2.sample(list); // 出力: B
		// 選択肢C: 変数も中身もBなのでBのsampleが呼ばれる
		b1.sample(list); // 出力: B

	}

}
