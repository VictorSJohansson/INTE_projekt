package org.framework.core.runtime;

import org.framework.core.test.target.*;

public class RuntimeExample {

	public static void main(String[] args)
	{
		Runtime rt = new Runtime(TestClassException.class, TestClass.class,TestClass.class);
		
		System.out.println(rt.execute().summary());
//		rt.execute()
	}
}
