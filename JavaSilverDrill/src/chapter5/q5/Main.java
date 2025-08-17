package chapter5.q5;

public class Main {

	public static void main(String[] args) {
		Item[] items = new Item[3];
		int total = 0;
		for (int i = 0; i < items.length; i++) {
			total += items[i].price; // items[i]はnullなのでNullPointerExceptionが発生する
			// NullPointerExceptionを発生させない場合は、items[i]にItemのインスタンスを代入する必要がある
			// 例: items[i] = new Item();
			// 現状はitems[i]はnullのままなので、NullPointerExceptionが発生する
		}
		System.out.println(total); // この行は実行されない
	}

}
