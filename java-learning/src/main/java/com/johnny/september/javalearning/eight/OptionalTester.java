package com.johnny.september.javalearning.eight;

import java.util.Optional;
import java.util.function.*;

/**
 * Optional 类是一个可以为null的容器对象。如果值存在则isPresent()方法会返回true，调用get()方法会返回该对象。
 *
 * Optional 是个容器：它可以保存类型T的值，或者仅仅保存null。Optional提供很多有用的方法，这样我们就不用显式进行空值检测。
 *
 * @author johnny
 * @date 2018/7/11
 * @since JDK 1.8
 */
public class OptionalTester {

	public static void main(String[] args) {
		Optional o1 = Optional.empty();
		//1、输入参数为空，返回空optional
		Optional<Object> o2 = Optional.ofNullable(null);

		System.out.println(o1);
		System.out.println(o2);

		//2、输入参数为空，抛出异常
		// Optional<Object> o3 = Optional.of(null);

		//3、如果存在该值，返回包含的值，否则抛出由 Supplier 继承的异常
		// Supplier supplier1 = () -> new Throwable("Throwable");
		// Optional.ofNullable(null).orElseThrow(supplier1);
		// Optional.ofNullable(null).orElseThrow();

		//4、如果存在该值，返回值， 否则触发 other，并返回 other 调用的结果
		Supplier supplier2 = () -> "get";
		String s1 = (String) Optional.ofNullable(null).orElseGet(supplier2);
		String ss = (String) Optional.ofNullable(null).orElseGet(OptionalTester::supplier);
		System.out.println(s1);
		System.out.println(ss);

		//5、如果值存在则使用该值调用 consumer , 否则不做任何事情
		Consumer consumer = a -> System.out.println(a);
		Optional.of("ifPresent").ifPresent(consumer);
		Optional.of("ifPresent").ifPresent(OptionalTester::consumer);

		//6、如果值存在则使用该值调用 consumer , 否则不做任何事情。
		System.out.println(Optional.of("get").get());

		//7、如果值存在，并且这个值匹配给定的 predicate，返回一个Optional用以描述这个值，否则返回一个空的Optional。
		Predicate predicate = a -> a.equals("filter");
		System.out.println(Optional.of("filter").filter(predicate));
		System.out.println(Optional.of("filter").filter(OptionalTester::predicate));

		//8、如果存在该值，提供的映射方法，如果返回非null，返回一个Optional描述结果。
		Function function = a -> "function input param: " + a;
		System.out.println(Optional.of("map").map(function));
		System.out.println(Optional.of("map").map(OptionalTester::function));

	}

	public static void consumer(Object a) {
		System.out.println(a);
	}

	public static boolean predicate(Object a) {
		return a.equals("filter");
	}

	public static Object supplier() {
		return "get";
	}

	public static Object function(Object in) {
		return "function input param: " + in;
	}
}
