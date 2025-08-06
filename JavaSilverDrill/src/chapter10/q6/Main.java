package chapter10.q6;

public class Main {

	public static void main(String[] args) {
		int result = sample();
		System.out.println(result); // 出力は20
	}

	private static int sample() {
		try {
			throw new RuntimeException(); // RuntimeExceptionをスロー
		} catch (RuntimeException e) {
			return 10;
		} finally {
			return 20; // finallyブロックで20を返す
		}
	}

}
