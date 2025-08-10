package chapter12.q40;

public class Main {

	public static void main(String[] args) {
		String[] array = { "A", "B", "C", "D" };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			if (array[i].equals("C")) {
				continue; // "C"のときは次のループへ
			}
			System.out.print("end");
			break; // "C"以外のときはループを終了
		}
		// 出力は "A end" となる
	}

}
