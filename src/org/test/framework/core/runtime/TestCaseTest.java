
package org.test.framework.core.runtime;

import org.junit.Test;
import org.test.framework.TestClassWithSetup;
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

	@Test(expected = NullPointerException.class)
	public void testTestCaseClass_Constructor_NullConstructor_cannotRun()
	{
		tc.run();
	}

	@Test(expected = NullPointerException.class)
	public void testTestCaseClass_Constructor_EmptyConstructor_cannotRun()
	{
		tc = new TestCase("");
		tc.run();
	}

	@Test
	public void testTestCaseClass_Constructor_Parameter_CanRun()
	{
		try
		{
			tc = new TestCase("testMethod", this.getClass().newInstance());
			tc.run(new TestResult());
		}
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Test
	public void testTestCaseClass_Method_Run_TestResultIsCorrect()
	{
		try
		{
			tc = new TestCase("testMethod", TestClass.class.newInstance());
			assertThat(tc.run().summary(), is("1 run, 0 failed"));
		}
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testTestCaseClass_Method_Run_TestResultIsIncorrect()
	{
		try
		{
			tc = new TestCase("test", TestClass.class.newInstance());
			assertThat(tc.run().summary(), is("1 run, 1 failed"));
		}
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testTestCaseClass_Method_Setup_addSetupValue()
	{
		try
		{
			Object instance = TestClassWithSetup.class.newInstance();
			new TestCase("testMethod", instance).run();
			assertThat(((TestClassWithSetup) instance).setup, is(true));
		}
		catch (InstantiationException | IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
