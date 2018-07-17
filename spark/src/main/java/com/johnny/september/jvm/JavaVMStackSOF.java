package com.johnny.september.jvm;

/**
 * VM Args: -Xss160k
 *
 * <pre>
 *     -Xss: 本地方法栈大小
 * </pre>
 * @author johnny
 * @version 2.0
 * @date 2018/2/2
 * @since JDK 1.8
 */
public class JavaVMStackSOF {

	private int stackLength = 1;

	public void stackLeak() {
		stackLength++;
		stackLeak();
	}

	public static void main(String[] args) throws Throwable {
		JavaVMStackSOF oom = new JavaVMStackSOF();
		try {
			oom.stackLeak();
		} catch (Throwable e) {
			System.out.println("stack length:" + oom.stackLength);
			throw e;
		}

	}
}
