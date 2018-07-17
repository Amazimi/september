package com.johnny.september.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 一句话描述
 *
 * @author johnny
 * @version 2.0
 * @date 2017/12/12
 * @since JDK 1.8
 */
public class test {

	public static void main(String[] args) {
		List<String> lists = new ArrayList<>();
		List<String> collect = lists.stream().map(g -> g).collect(Collectors.toList());
		System.out.println(collect.size());
	}
}
