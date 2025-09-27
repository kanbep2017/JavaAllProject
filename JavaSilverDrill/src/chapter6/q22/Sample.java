package chapter6.q22;

public class Sample {
	static int num; // staticフィールドの初期化
	{
		num = 10; // 初期化子でフィールドnumに値を代入
	}

	public Sample() {
		num = 100; // コンストラクタでフィールドnumに値を代入
	}
}
