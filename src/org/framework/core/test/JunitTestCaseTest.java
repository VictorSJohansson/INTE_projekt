package org.framework.core.test;

import java.lang.reflect.Method;

import org.junit.Test;
import org.framework.core.test.target.TestClassWithSetup;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.rules.*;
import org.junit.Rule;

import static org.junit.Assert.*;

import org.hamcrest.core.IsNull;
import org.framework.core.runtime.SuccessfulTask;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matcher.*;

import org.framework.core.runtime.*;
import org.framework.core.test.target.*;


public class JunitTestCaseTest {

	TestCase tc;



	@Before
	public void initialize()
	{
		tc = new TestCase(null);
	}
	
	@Test
	public void testTestCaseClass_Constructor_NullConstructor_methodName()
	{
		assertThat(tc.getMethodName(), is(nullValue()));
	}
	

	@Test(expected = IllegalAccessException.class)
	public void testTestCaseClass_Constructor_IllegalAccess_isThrown()
	{
		tc = new TestCase("illegallyAccess", new MockMesser());
		TestResult result = tc.run(new TestResult());
		assertThat(result.summary(), is("1 run, 1 failed"));
	}
	

	@Test(expected = NullPointerException.class)
	public void testTestCaseClass_Constructor_EmptyConstructor_cannotRun()
	{
		tc = new TestCase("");
		//TestResult result = tc.run(new TestResult());
		//System.out.println("----------------EMPTYCONSTRUCTOR" + result.summary());
		assertEquals(tc.run(), null);
		//assertThat(result.summary(), is("0 run, 0 failed"));
	}

	@Test
	public void testTestCaseClass_Constructor_Parameter_CanRun()
	{
		try
		{
			tc = new TestCase("testMethod", this.getClass().newInstance());
			assertThat(tc.run().summary(), is("1 run, 1 failed"));
		}
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			System.out.println("InstantationException - testTestCaseClass_Constructor_Parameter_CanRun");
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			System.out.println("IllegalAccessException - testTestCaseClass_Constructor_Parameter_CanRun");
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
			System.out.println("InstantationException - testTestCaseClass_Method_Run_TestResultIsCorrect");
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			System.out.println("IllegalAccessException - testTestCaseClass_Method_Run_TestResultIsCorrect");
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
			System.out.println("InstantationException - testTestCaseClass_Method_Run_TestResultIsIncorrect");
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			System.out.println("IllegalAccessException - testTestCaseClass_Method_Run_TestResultIsIncorrect");
		}

	}

	@Test
	public void testTestCaseClass_Method_Setup_addSetupValue()
	{
		try
		{
			Object instance = TestClassWithSetup.class.newInstance();
			TestCase t = new TestCase("testMethod", instance);
			t.run();
			assertThat(((TestClassWithSetup) instance).getSetup(), is(true));
		}
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			System.out.println("InstantationException - testTestCaseClass_Method_Setup_addSetupValue");
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			System.out.println("IllegalAccessException - testTestCaseClass_Method_Setup_addSetupValue");
		}
	}

	@Test
	public void testTestCaseClass_Method_Teardown_addTeardownValue()
	{
		try
		{
			Object instance = TestClassWithSetup.class.newInstance();
			TestCase t = new TestCase("testMethod", instance);
			t.run();
			assertThat(((TestClassWithSetup) instance).getTeardown(), is(true));
		}
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			System.out.println("InstantationException - testTestCaseClass_Method_Teardown_addTeardownValue");
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			System.out.println("IllegalAccessException - testTestCaseClass_Method_Teardown_addTeardownValue");
		}
	}

	@Test(expected = NullPointerException.class)
	public void testTestCaseClass_Method_run_testNullPointerException_onMethodName()
	{
		try
		{
			overrideTestCaseTestBeforeAnnotation(null,
					TestClassWithSetup.class.newInstance());
		}
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			System.out.println("InstantationException - testTestCaseClass_Method_run_testNullPointerException_onMethodName");
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			System.out.println("IllegalAccessException - testTestCaseClass_Method_run_testNullPointerException_onMethodName");
		}
	}

	@Test(expected = NullPointerException.class)
	public void testTestCaseClass_Method_run_testNullPointerException_onInstance()
	{
		overrideTestCaseTestBeforeAnnotation("testMethod", null);
	}

	public void overrideTestCaseTestBeforeAnnotation(String methodName,
			Object instance)
	{
		tc = new TestCase(methodName, instance);
		tc.run();
	}

}
