package chapter12.q23;

import java.util.Collection;
import java.util.List;

public class B extends A {
	// Aクラスのメソッドをオーバーライドします。
	@Override
	public void sample(Collection arg) {
		System.out.println("B");
	}

	public void sample(List arg) {
		System.out.println("C");
	}

}
