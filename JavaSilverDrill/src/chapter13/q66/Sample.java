package chapter13.q66;

public class Sample {

	public static void main(String[] args) {
		Item[] items = new Item[3];
		items[1] = new Item("A");
		items[2] = new Item("B");
		for (Item item : items) {
			System.out.println(item.name);
		}
		// NullPointerException が発生します。
		// 末尾がnullの場合も NullPointerException が発生します。
		// ◆なぜ？
		// items[0] は初期化されていないため、null です。
		// ループ内で item.name を参照しようとすると、null の name フィールドにアクセスしようとして NullPointerException が発生します。
		// ◆NullPointerExceptionとは？
		// NullPointerException は、null 参照に対してメソッドを呼び出そうとしたり、フィールドにアクセスしようとしたりした場合に発生する例外です。
		// これは、オブジェクトが存在しない（null）状態で、そのオブジェクトのメソッドやフィールドにアクセスしようとしたことを示します。
		// nullのnameを参照しようとしたため、NullPointerExceptionが発生します。
	}

}
