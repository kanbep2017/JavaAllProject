package chapter13.q42;

public class Sample implements AutoCloseable {
	@Override
	public void close() throws Exception {
		// throws とは 例外を投げることです。
		// 例外を投げると、try-with-resources 文の後にある catch ブロックが実行されます。
		// ここでは何もしません。
		System.out.println("C");
	}
}
