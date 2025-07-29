package chapter7.q21;

class Parent {
	public Parent() {
		System.out.println("A");
	}

	public Parent(String val) {
		this();
		System.out.println(val);
	}
}
