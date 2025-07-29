package com.sample;

public class Test {
	public void process(Sample sample) {
		//		事前処理
		System.out.println("start");
		//		やりたかったこと
		sample.execute();
		//		事後処理
		System.out.println("end");
	}
}
