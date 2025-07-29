package chapter7.q21;

class Child extends Parent {
	public Child() {
		super("B");
		System.out.println("C");
	}

	public Child(String val) {
		//		this(); // コメントアウトしない→A,B,C,Dが出力される。コメントアウトする→A,Dが出力される。(superコンストラクタが呼ばれるため)
		System.out.println(val);
	}
}
