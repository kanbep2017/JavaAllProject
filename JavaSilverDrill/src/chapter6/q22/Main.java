package chapter6.q22;

public class Main {

	public static void main(String[] args) {
		System.out.println(Sample.num);
		// 出力結果は、0である。100とはならない
		// newされていないので、初期化子の処理は実行されない
		// 初期化子は、インスタンスが生成されたときに実行される
		// そのため、Sample.numは0のまま
	}

}
