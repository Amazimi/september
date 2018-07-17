package com.johnny.september.jvm;

import java.util.ArrayList;

/**
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *
 * <pre>
 *     -Xms:
 *     堆最小值20M
 *     -Xmx:
 *     堆最大值20M
 *     -XX:+HeapDumpOnOutOfMemoryError:
 *     Enables the dumping of the Java heap to a file in the current directory by using the heap profiler (HPROF) when a java.lang.OutOfMemoryError exception is thrown.
 *     You can explicitly set the heap dump file path and name using the -XX:HeapDumpPath option.
 *     By default, this option is disabled and the heap isn’t dumped when an OutOfMemoryError exception is thrown.
 * </pre>
 * @author johnny
 * @version 2.0
 * @date 2018/2/2
 * @since JDK 1.8
 */
public class HeapOOMTest {

	static class OOMObject{

	}

	public static void main(String[] args) {
		ArrayList<OOMObject> oomObjects = new ArrayList<>();
		while (true) {
			try {
				Thread.sleep(1);
				oomObjects.add(new OOMObject());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}
