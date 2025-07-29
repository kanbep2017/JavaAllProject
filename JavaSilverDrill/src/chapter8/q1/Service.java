package chapter8.q1;

class Service {
	// Algorithm型のフィールド。ここにラムダ式（処理内容）を保持します。
	private Algorithm logic;

	// 外部からAlgorithm（ラムダ式）をセットするメソッド
	public void setLogic(Algorithm logic) {
		this.logic = logic;
	}

	// 実際に処理を実行するメソッド
	public void doProcess(String name) {
		System.out.println("start");
		// セットされたAlgorithm（ラムダ式）のperformメソッドを呼び出します。
		this.logic.perform(name);
		System.out.println("end");
	}

}