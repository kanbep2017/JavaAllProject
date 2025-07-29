package chapter8.q1;

public class Main {

	public static void main(String[] args) {
		// Algorithmインターフェースの実装をラムダ式で記述しています。
		// (name) -> { ... } の部分がラムダ式です。
		// これは「perform(String name)」メソッドの処理内容を
		// 直接書いていることになります。
		Algorithm algorithm = (name) -> {
			System.out.println("hello, " + name);
		};
		// Serviceクラスのインスタンスを生成
		Service s = new Service();
		// setLogicでラムダ式を渡したAlgorithmをセット
		s.setLogic(algorithm);
		// doProcessで処理を実行。ラムダ式の内容が呼ばれます。
		s.doProcess("Lambda");
	}

}