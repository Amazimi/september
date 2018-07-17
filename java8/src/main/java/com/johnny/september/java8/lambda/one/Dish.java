package com.johnny.september.java8.lambda.one;

/**
 * 一句话描述
 *
 * @author johnny
 * @version 2.0
 * @date 2017/10/21
 * @since JDK 1.8
 */
public class Dish {
	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;

	public Dish(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	public enum Type { MEAT, FISH, OTHER }

	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}
}
