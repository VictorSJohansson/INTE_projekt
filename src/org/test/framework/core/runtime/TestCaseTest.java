package org.test.framework.core.runtime;

import org.junit.Test;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matcher.*;

public class TestCaseTest extends TestCase{

	TestCase tc;
	
	public TestCaseTest()
	{
		super("testMethod");
	}
	
	private TestCaseTest(String methodName)
	{
		super(methodName);
		// TODO Auto-generated constructor stub
	}

	@Before
	public void initialize()
	{
		tc = new TestCaseTest();
	}
	
	@Test
	public void testRun_runCount ()
	{
		assertThat(tc.run().runCount, is(1));
	}
	
	@Test
	public void testRun_errorCount ()
	{
		assertThat(tc.run().errorCount, is(0));
	}
	
	public void testMethod()
	{
		
	}
	
}
