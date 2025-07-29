package com.sample;

import java.util.function.Consumer;

public class Item {
	private String id;
	private String name;
	private String description;
	private int price;

	public Item id(String id) { // Item型で返却する。メソッド名はフィールド名をそのまま使う。
		this.id = id;
		return this; // 自分自身への参照を返す。
	}

	public Item name(String name) { // Item型で返却する。メソッド名はフィールド名をそのまま使う。
		this.name = name;
		return this; // 自分自身への参照を返す。
	}

	public Item description(String description) { // Item型で返却する。メソッド名はフィールド名をそのまま使う。
		this.description = description;
		return this; // 自分自身への参照を返す。
	}

	public Item price(int price) { // Item型で返却する。メソッド名はフィールド名をそのまま使う。
		this.price = price;
		return this; // 自分自身への参照を返す。
	}

	public static void save(Consumer<Item> con) { // セーブする。
		Item item = new Item();
		con.accept(item);
		System.out.println("save:" + item);
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}

}
