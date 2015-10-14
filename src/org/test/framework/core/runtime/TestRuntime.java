
package org.test.framework.core.runtime;

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

	private static final Class<TestClass> TEST_CLASS = TestClass.class;
	private static final Class<OurTest> ANNOTATION = OurTest.class;

	private Runtime rt;

	@Before
	public void initialize()
	{
		rt = new Runtime(TEST_CLASS);
	}

	@Test
	public void testRuntimeClass_Constructor_EmptyConstructor()
	{
		rt = new Runtime();
		rt.addClass(TEST_CLASS);
		helpMethod_ListIsSame();
	}

	@Test
	public void testRuntimeClass_Constructor_ParameterConstructor()
	{
//		rt = new Runtime(TEST_CLASS);
		helpMethod_ListIsSame();
	}

	public void helpMethod_ListIsSame()
	{
		List<Class<?>> classList = rt.classList;
		assertThat(classList.get(0).getName(), is(TEST_CLASS.getName()));
	}

	@Test
	public void testRuntimeClass_Method_getListOfAnnotationMethod()
	{
		List<String> list = rt.getMethodNames(ANNOTATION, TEST_CLASS);
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
	}
	
	@Test
	public void testRuntimeClass_Method_addClass_TryAddSeveralClassesFromList()
	{
		List<Class<?>> classes = new ArrayList<>();
		classes.add(TEST_CLASS);
		classes.add(TestClassException.class);
		
		rt.addClass(classes);
	}
	
}
