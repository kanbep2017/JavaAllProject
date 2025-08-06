package chapter10.q11;

public class Sample {
	public void hello(String name) throws SampleException, TestException {
		// もしくはSampleExceptionだけでもいい
		// SampleExceptionはExceptionのサブクラス(チェック例外)
		// TestExceptionはRuntimeExceptionのサブクラス(非チェック例外)
		// throws SampleExceptionと書くと、SampleExceptionはチェック例外なので、
		// 呼び出し元で必ず例外処理をしなければならない。
		// throws TestExceptionと書くと、TestExceptionは非チェック例外なので、
		// 呼び出し元で例外処理をしなくてもよい。

		// そもそもthrowsとは、メソッドが例外をスローする可能性があることを示すキーワードです。
		// 呼び出し元で例外処理をしなければならない場合は、throwsキーワードを使って
		// メソッドのシグネチャに例外を宣言します。
		if (name == null) {
			throw new SampleException();
		}
		if ("".equals(name)) {
			throw new TestException();
		}
	}
}
