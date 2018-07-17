package com.johnny.september.spark.quickstart;

import org.apache.commons.collections.IteratorUtils;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;

/**
 * 单词数统计应用
 *
 * @author johnny
 * @version 2.0
 * @date 2017/12/7
 * @since JDK 1.8
 */
public class WordCount {

	public static void main(String[] args) {
		String inputFile = "/Users/johnny/app/spark/spark-2.2.0-bin-hadoop2.7/README.md";
		String outputFile = "/Users/johnny/app/spark/spark-2.2.0-bin-hadoop2.7/test/wordcounts";
		SparkConf conf = new SparkConf().setMaster("local").setAppName("wordCount");
		JavaSparkContext sc = new JavaSparkContext(conf);
		//读取数据，转换为弹性分布式数据集
		JavaRDD<String> input = sc.textFile(inputFile);
		//切分为单词
		JavaRDD<String> words = input.flatMap((s) -> IteratorUtils.arrayIterator(s.split(" ")));
		// 转换为键值对
		JavaPairRDD<String, Integer> pairRDD = words.mapToPair((x) -> new Tuple2(x, 1));
		//计数 （转化操作）
		JavaPairRDD<String, Integer> counts = pairRDD.reduceByKey((x, y) -> x + y);
		// 将统计出来的单词总数存入一个文本文件，引发求值 （行动操作）
		counts.saveAsTextFile(outputFile);
	}
}
