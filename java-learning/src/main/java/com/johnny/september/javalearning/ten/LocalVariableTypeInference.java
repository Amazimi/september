package com.johnny.september.javalearning.ten;

/**
 * 局部变量类型推断
 *
 * var 生命周期只存在于编译器中
 * 在编译器中推断出变量类型，然后将实际的类型写入字节码，就像以往的强类型显式声明一样
 * 具有初始化器的局部类型变量声明
 *
 * @author johnny
 * @date 2018/7/11
 * @since JDK 1.8
 */
public class LocalVariableTypeInference {

	public static void main(String[] args) {
		var s = "1";
		var i = 1;
		var f = 1.0;
		var o = new Object();

		System.out.println(s);
		System.out.println(i);
		System.out.println(f);
		System.out.println(o);
	}
}
