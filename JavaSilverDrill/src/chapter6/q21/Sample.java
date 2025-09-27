package chapter6.q21;

public class Sample {
	Sample() {
		System.out.println("A"); // 初期化子の後に実行される
	}

	{
		System.out.println("B"); // 初期化子(一番最初に実行される)
	}
}
