package chapter10.q1;

public class Main {

	public static void main(String[] args) {
		try {
			int[] array = {}; // 空の配列を作成
			array[0] = 10; // 空の配列にアクセスしようとするとArrayIndexOutOfBoundsExceptionが発生する
			System.out.println("finish"); // この行は実行されない
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error"); // 例外が発生した場合、ここに到達する
		}

	}

}
