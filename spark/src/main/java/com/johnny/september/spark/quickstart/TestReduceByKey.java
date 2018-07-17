package com.johnny.september.spark.quickstart;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * 一句话描述
 *
 * @author johnny
 * @version 2.0
 * @date 2017/12/8
 * @since JDK 1.8
 */
public class TestReduceByKey {

	private static SparkConf conf;

	private static JavaSparkContext sc;

	private static String inputFile;

	private static String outputFile;

	static  {
		conf = new SparkConf().setMaster("local").setAppName("test");
		sc = new JavaSparkContext(conf);

		inputFile = "/Users/johnny/app/spark/spark-2.2.0-bin-hadoop2.7/README.md";
		outputFile = "/Users/johnny/app/spark/spark-2.2.0-bin-hadoop2.7/test/wordcounts";
	}

	public static void main(String[] args) {

		JavaRDD<String> stringJavaRDD = sc.textFile(inputFile);
	}
}
