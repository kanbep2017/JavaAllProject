package chapter8.q2;

public class Main {

	public static void main(String[] args) {
		// insert code here

		// A
		Function fA = (name) -> {
			return "hello, " + name;
		};

		// B
		//		Function fB = (name) -> {
		//			"hello, " + name;
		//		};

		// C
		//		Function fC = (name) -> return "hello, " + name;

		// D
		Function fD = (name) -> "hello, " + name;

		// E
		Function fE = name -> {
			return "hello, " + name;
		};

		System.out.println(fA.test("Lambda"));
		//		System.out.println(fB.test("Lambda"));
		//		System.out.println(fC.test("Lambda"));
		System.out.println(fD.test("Lambda"));
		System.out.println(fE.test("Lambda"));
	}

	private static interface Function {
		String test(String name);
	}
}
