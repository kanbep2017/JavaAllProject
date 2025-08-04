package chapter9.q18;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = List.of("A", "B", "C"); // List.ofで固定長のリストを作成
		// 選択肢A：正しいコード
		list.forEach(str -> System.out.println(str)); // listの各要素をstrとして活用し所定の方法で出力する。（ラムダ式は難しいがそういうもんだと理解する。）
		// 選択肢B：誤ったコード
		//		list.for(str -> System.out.println(str));
		// 選択肢C：正しいコード
		list.forEach(System.out::println); // listの各要素をSystem.out.printlnメソッド参照で出力する。（これもいきなり出てきた考え方だがそういうもんだと理解する。）
		// 選択肢D：誤ったコード
		//		list.forEach(System.out::println());
		// 選択肢E：誤ったコード
		//		list.for(System.out::println);
	}

}
