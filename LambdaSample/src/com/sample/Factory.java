package com.sample;

public class Factory {
	public static Sample create() {
		Sample sample = () -> {
			System.out.println("lambda");
		};
		return sample;
	}
}
