package chapter12.q12;

public class Main {

	public static void main(String[] args) {
		String str = "abcd ef gh";
		int x = str.indexOf("ef"); // 5
		str.substring(x + 3); // "gh"を返す
		x = str.indexOf("ef"); // strの内容は変わっていないので、再度5を返す
		System.out.println(str + " " + x); // 出力は "abcd ef gh 5"

	}

}
