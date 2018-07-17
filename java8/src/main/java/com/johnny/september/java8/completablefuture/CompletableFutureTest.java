package com.johnny.september.java8.completablefuture;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 一句话描述
 *
 * @author johnny
 * @version 2.0
 * @date 2017/9/20
 * @since JDK 1.8
 */
public class CompletableFutureTest {

		public static void main(String[] args)
				throws IOException, InterruptedException, TimeoutException, ExecutionException {
			long start = System.currentTimeMillis();
			CompletableFuture<Double> future1 = CompletableFuture.supplyAsync(() -> {
				try {
					Thread.sleep(5000);
					System.out.println("====任务1===");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				return 200.0;
			});

			CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
				try {
					Thread.sleep(5000);
					System.out.println("====任务2===");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				return "number2";
			});

			CompletableFuture<List<Integer>> future3 = CompletableFuture.supplyAsync(() -> {
				try {
					Thread.sleep(5000);
					System.out.println("====任务3===");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				List<Integer> array = new ArrayList<>();
				array.add(1);
				array.add(2);
				return array;
			});

			System.out.println("==============执行中");
			CompletableFuture.allOf(future1, future2, future3).get(7000, TimeUnit.MILLISECONDS);
			System.out.println(future1.get());
			System.out.println(future2.get());
			System.out.println(future3.get());
			System.out.println(System.currentTimeMillis() - start + "ms");
			System.out.println("==============执行结束");
		}
}
