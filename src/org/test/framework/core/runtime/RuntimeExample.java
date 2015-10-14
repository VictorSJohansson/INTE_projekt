package org.test.framework.core.runtime;

public class RuntimeExample {

	public static void main(String[] args)
	{
		Runtime rt = new Runtime(TestClassException.class, TestClass.class);
		
		System.out.println(rt.execute().summary());
//		rt.execute()
	}
}
