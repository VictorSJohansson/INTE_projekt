package org.test.framework.core.runtime.old;

import org.junit.*;
import org.test.framework.core.runtime.OurTest;

public class TestOurTest {

	Object o;
	
	@OurTest(methodName = "")
	public void test()
	{
		//Test
		//Test5
		//Test4
		//Test3
	}
	
	@Test
	public void t()
	{
		
	}
	
	public boolean Assert(int expected, int actual)
	{
		return expected == actual;
	}
	
	public void Assert(String expected, String actual)
	{

	}
	
}
