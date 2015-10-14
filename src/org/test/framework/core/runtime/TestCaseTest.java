
package org.test.framework.core.runtime;

import org.junit.Test;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

import org.hamcrest.core.IsNull;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matcher.*;

public class TestCaseTest {

	TestCase tc;

	@Before
	public void initialize()
	{
		tc = new TestCase(null);
	}

	@Test
	public void testTestCaseClass_Constructor_NullConstructor_methodName()
	{
		assertThat(tc.methodName, IsNull.nullValue());
	}

	@Test
	public void testTestCaseClass_Constructor_NullConstructor_Method()
	{
		assertThat(tc.method, IsNull.nullValue());
	}
	
	@Test(expected=NullPointerException.class)
	public void testTestCaseClass_Constructor_NullConstructor_cannotRun()
	{
		tc.run();
	}
	
	@Test(expected=NullPointerException.class)
	public void testTestCaseClass_Constructor_EmptyConstructor_cannotRun()
	{
		tc = new TestCase("");
		tc.run();
	}
	
	
	
	@Test
	public void testTestCaseClass_Constructor_Parameter_CanRun()
	{
		tc = new TestCase("testMethod");
		tc.run(new TestResult(), this.getClass());
	}
	
}
