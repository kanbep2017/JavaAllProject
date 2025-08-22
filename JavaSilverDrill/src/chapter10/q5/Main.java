package chapter10.q5;

public class Main {

	public static void main(String[] args) {
		System.out.println(test(null)); // 出力は "B" , "A" 
	}

	private static String test(Object obj) {
		try {
			System.out.println(obj.toString()); // objがnullの場合、NullPointerExceptionが発生
		} catch (NullPointerException e) {
			return "A"; // NullPointerExceptionがキャッチされると"A"を返す
		} finally {
			System.out.println("B"); // finallyブロックは必ず実行される finallyしてからreturnする
		}
		return "C"; // この行は実行されない
	}

}
