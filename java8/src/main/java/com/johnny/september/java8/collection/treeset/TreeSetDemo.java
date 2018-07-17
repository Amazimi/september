package com.johnny.september.java8.collection.treeset;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;

/**
 * treeSet 根据compareTo方法进行排序，也根据compareTo方法进行元素去重，
 * 如果compareTo返回0，treeSet会忽略掉此元素
 *
 * @author johnny
 * @version 2.0
 * @date 2017/9/21
 * @since JDK 1.8
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		Date now = new Date();
		List<Sku> arrayList = new ArrayList<Sku>();
		Sku sku = new Sku();
		sku.setSkuId(1L);
		sku.setGroupType(1);
		sku.setSkuName("dd");
		sku.setUpdateTime(now);
		Sku sku2 = new Sku();
		sku2.setSkuId(2L);
		sku2.setGroupType(2);
		sku2.setSkuName("ddd");
		sku2.setUpdateTime(now);
		arrayList.add(sku);
		arrayList.add(sku2);
		TreeSet treeSet = new TreeSet(arrayList);
		System.out.println("arrayList:" + arrayList);
		System.out.println("treeSet:" + treeSet);

	}
}
