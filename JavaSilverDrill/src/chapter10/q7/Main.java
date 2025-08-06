package chapter10.q7;

public class Main {

	public static void main(String[] args) {
		int result = sample();
		System.out.println(result); // 出力は10

	}

	private static int sample() {
		int val = 0;
		try {
			String[] array = { "A", "B", "C" };
			System.out.println(array[3]); // RuntimeExceptionが発生する
		} catch (RuntimeException e) {
			val = 10;
			return val; // ここで10を返す
		} finally {
			val += 10;
		}
		return val;
	}

}
