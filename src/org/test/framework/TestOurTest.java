package org.test.framework;

import org.test.framework.OurTest;

import org.junit.*;

public class TestOurTest {

	Object o;
	
	@OurTest
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
