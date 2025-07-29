package chapter8.q1;

interface Algorithm {
	// このメソッドは処理内容を外部から渡すためのものです。
	// ラムダ式で実装されることで、柔軟に処理を切り替えられます。
	void perform(String name);
}