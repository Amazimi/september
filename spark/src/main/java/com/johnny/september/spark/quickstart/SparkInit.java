package com.johnny.september.spark.quickstart;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * 一句话描述
 *
 * @author johnny
 * @version 2.0
 * @date 2017/12/7
 * @since JDK 1.8
 */
public class SparkInit {

	public static void main(String[] args) {
		//local:表示可以让Spark运行在单机单线程上
		//AppName:应用名可以在集群管理器的用户界面展示
		SparkConf conf = new SparkConf().setMaster("local").setAppName("My App");
		JavaSparkContext sc = new JavaSparkContext(conf);
	}
}
