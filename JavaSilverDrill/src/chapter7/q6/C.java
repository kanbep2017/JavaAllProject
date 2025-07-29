package chapter7.q6;

public class C implements B {
	@Override
	public void sample() {
		B.super.sample();
		System.out.println("Java");
	}
}
