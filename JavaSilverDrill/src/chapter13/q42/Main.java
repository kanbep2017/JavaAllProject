package chapter13.q42;

public class Main {

	public static void main(String[] args) {
		try (Sample s = new Sample()) {
			throw new Exception();
		} catch (Exception e) {
			// 例外が発生した場合、ここに入ります。
			// Sample クラスの close() メソッドが呼び出されます。
			System.out.println("A");
		} finally {
			// finally ブロックは、try ブロックの後に必ず実行されます。
			System.out.println("B");
		}
		// 出力は "C"、"A"、"B" です。
	}

}
