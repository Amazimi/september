package com.johnny.september.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 一句话描述
 *
 * @author johnny
 * @version 2.0
 * @date 2017/10/17
 * @since JDK 1.8
 */
public class test {

	public static void main(String[] args) {
		final int num = 100;
		Runnable r = ()->System.out.println(num);

		List<String> str = Arrays.asList("a","b","A","B");
		str.sort(String::compareToIgnoreCase);

		// 等价
		Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);
		Function<String, Integer> stringToInteger2 = Integer::parseInt;

		Supplier call = String::new;
	}


}

