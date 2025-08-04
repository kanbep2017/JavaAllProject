package chapter9.q19;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<Integer, Item> map = new HashMap<Integer, Item>();
		map.put(1, new Item(1, "A"));
		map.put(2, new Item(2, "B"));
		map.put(3, new Item(3, "C"));
		map.put(1, new Item(1, "A")); // 同じキーで異なるインスタンスを追加しても、キーが重複するため上書きされる。
		map.put(null, new Item(0, "default")); // HashMapはnullキーを許容するため、nullキーでアイテムを追加できる。
		System.out.println(map.size()); // 出力は4。
	}

}
