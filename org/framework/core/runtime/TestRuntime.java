package org.framework.core.runtime;

import org.junit.Test;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matcher.*;

public class TestRuntime {

	private static final Class<TestClass> TEST_CLASS_ONE = TestClass.class;
	private static final Class<TestClassException> TEST_CLASS_TWO = TestClassException.class;

	private static final Class<OurFramework> ANNOTATION = OurFramework.ANNOTATION;

	private Runtime rt;

	@Before
	public void initialize()
	{
		rt = new Runtime(TEST_CLASS_ONE);
	}

	@Test
	public void testRuntimeClass_Constructor_EmptyConstructor()
	{
		rt = new Runtime();
		rt.addClass(TEST_CLASS_ONE);
		helpMethod_ListIsSame();
	}

	@Test
	public void testRuntimeClass_Constructor_ParameterConstructor()
	{
		// rt = new Runtime(TEST_CLASS);
		helpMethod_ListIsSame();
	}

	public void helpMethod_ListIsSame()
	{
		List<Class<?>> classList = rt.getClassList();
		assertThat(classList.get(0).getName(), is(TEST_CLASS_ONE.getName()));
	}

	@Test
	public void testRuntimeClass_Method_getListOfAnnotationMethod()
	{
		List<String> list = rt.getMethodNames(ANNOTATION, TEST_CLASS_ONE);
		assertThat(list.get(0), is("testMethod"));
	}

	@Test
	public void testRuntimeClass_Method_executeMethodSuccess()
	{
		assertThat(rt.execute().summary(), is("2 run, 0 failed"));
	}

	@Test
	public void testRuntimeClass_Method_executeMethodFailed()
	{
		rt = new Runtime(TestClassException.class);
		assertThat(rt.execute().summary(), is("1 run, 1 failed"));
	}

	@Test
	public void testRuntimeClass_Method_ExecuteMethodSeveralConstructorParameter()
	{
		rt = new Runtime(TestClass.class, TestClassException.class);
		assertThat(rt.execute().summary(), is("3 run, 1 failed"));
	}

	@Test
	public void testRuntimeClass_Method_AddClass_AddOneClass()
	{
		rt.addClass(ANNOTATION);
		assertThat(rt.size(), is(2));
	}

	@Test
	public void testRuntimeClass_Method_addClass_TryAddSeveralClassesFromList()
	{
		List<Class<?>> classes = new ArrayList<>();
		classes.add(TEST_CLASS_ONE);
		classes.add(TestClassException.class);

		rt.addClass(classes);

		assertThat(rt.size(), is(3));
	}

	@Test
	public void testRuntimeClass_Method_addClass_TryAddSeveralClassesFromArray()
	{
		Class<?>[] cl =
		{ TEST_CLASS_ONE, ANNOTATION };
		rt.addClass(cl);

		assertThat(rt.size(), is(3));
	}

	@Test
	public void testRuntimeClass_Method_Execute_RunExecuteOneTest()
	{
		testExecuteOne();
	}

	@Test
	public void testRuntimeClass_Method_Execute_RunExecuteTwoTest()
	{
		testExecuteTwo();
	}

	@Test
	public void testRuntimeClass_Method_Execute_RunExecuteThreeTest()
	{
		testExecuteThree();
	}

	@Test
	public void testRuntimeClass_Method_Execute_RunSeveralExecuteTest()
	{
		testExecuteOne();
		testExecuteTwo();
		testExecuteThree();
	}

	public void testExecuteOne()
	{
		rt.emptyClasses();
		rt.addClass(TEST_CLASS_ONE);
		assertThat(rt.execute().summary(), is("2 run, 0 failed"));
	}

	public void testExecuteTwo()
	{
		rt.addClass(TEST_CLASS_TWO);
		assertThat(rt.execute().summary(), is("3 run, 1 failed"));
	}

	public void testExecuteThree()
	{
		rt.emptyClasses();

		Class<?>[] cl =
		{ TEST_CLASS_ONE, TEST_CLASS_ONE, TEST_CLASS_TWO };

		rt.addClass(cl);

		assertThat(rt.execute().summary(), is("5 run, 1 failed"));
	}
}
