package chapter10.q9;

public class Main {

	public static void main(String[] args) {
		try {
			try {
				String[] array = { "A", "B", "C" };
				System.out.println(array[3]); // ArrayIndexOutOfBoundsExceptionが発生
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("D"); // ここで例外をキャッチ
			} finally {
				System.out.println("E"); // finallyブロックが実行される
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("F"); // このブロックは実行されない
		} finally {
			System.out.println("G"); // 最後にこのブロックが実行される
		}
		// 出力は "D", "E", "G" となる
	}
}
