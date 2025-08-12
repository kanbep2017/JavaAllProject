package chapter13.q59;

public class Sample {

	public static void main(String[] args) {
		int num = 10;
		Integer val = Integer.valueOf(10);
		System.out.println(num == val); // true
		// ◆なぜ？
		// num はプリミティブ型 int で、val はラッパークラス Integer です。
		// == 演算子は、プリミティブ型とラッパークラスを比較する際に、ラッパークラスをプリミティブ型に自動的に変換します。
		// そのため、num と val は同じ値を持つため、true が出力されます。
		// ◆プリミティブ型とは何か？
		// プリミティブ型は、Javaの基本的なデータ型で、値そのものを直接表現します。
		// 例えば、int、char、boolean などがプリミティブ型です。
		// ◆ラッパークラスとは何か？
		// ラッパークラスは、プリミティブ型をオブジェクトとして扱うためのクラスです。
		// 例えば、Integer、Character、Boolean などがラッパークラスです。
	}

}
