
package org.framework.tests;

import org.junit.Test;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

import org.hamcrest.core.IsNull;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matcher.*;

import org.framework.Main;
import org.framework.tests.target.TestClassForMain;

public class JunitTestMain {

	private Main main;

	@Before
	public void createMainObject()
	{
		main = new Main();
	}

	@Test
	public void testMainClass_Constructor_createsARuntimeObject()
	{
		assertThat(main.runtime, is(IsNull.notNullValue()));
	}

	@Test
	public void testMainClass_Method_getZeroParameterFromMain()
	{
		assertThat(main.getParameters().size(), is(0));
	}

	@Test
	public void testMainClass_Method_addOneParameterToMain()
	{
		main.addParameter("test_addOneParameterToMain");
		assertThat(main.getParameters().size(), is(1));
	}

	@Test(expected = NullPointerException.class)
	public void testMainClass_Method_addNullParameterToMain()
	{
		main.addParameter(null, "test_addNullParameterToMain");
	}

	@Test
	public void testMainClass_Method_addSeveralParameterToMain()
	{
		main.addParameter("test_addSeveralParameterToMain_1",
				"test_addSeveralParameterToMain_2",
				"test_addSeveralParameterToMain_3",
				"test_addSeveralParameterToMain_4",
				"test_addSeveralParameterToMain_5");
		assertThat(main.getParameters().size(), is(5));
	}

	@Test
	public void testMainClass_Method_runWithZeroArgument()
	{
		runMain(0);
	}

	@Test
	public void testMainClass_Method_runWithOneArgument()
	{
		main.addParameter("test_runWithOneArgument");
		runMain(1);
	}

	@Test
	public void testMainClass_Method_runWithSeveralArgument()
	{
		main.addParameter("test_runWithSeveralArgument_1",
				"test_runWithSeveralArgument_2",
				"test_runWithSeveralArgument_3",
				"test_runWithSeveralArgument_4",
				"test_runWithSeveralArgument_5");
		runMain(5);
	}

	public void runMain(int expected)
	{
		main.run();
		assertThat(main.getParametersRan(), is(expected));
	}

	@Test
	public void testMainClass_Method_runMainMethodWithZeroArgument()
	{
		Main.main(new String[] {});
		assertThat(main.wasRun(), is(true));
	}

	@Test
	public void testMainClass_Method_runMainMethodWithOneArgument()
	{
		Main.main(new String[]
		{ "test_runMainMethodWithOneArgument" });
		assertThat(main.wasRun(), is(true));
		assertThat(main.getParametersRan(), is(1));
	}

	@Test
	public void testMainClass_Method_ensureParametersAreRemovedAfterRun()
	{
		main.addParameter("test_ensureParametersAreRemovedAfterRun");
		runMain(1);
		assertThat(main.getParameters().size(), is(0));
	}

	@Test
	public void testMainClass_Method_sendStringParameterToMainMethodAndEnsureItIsAViableClass()
	{
		try
		{
			main.addParameter("org.framework.tests.target.TestClassForMain");
			assertThat(Class.forName(main.getParameters().get(0)).getClass(),
					instanceOf(TestClassForMain.class.getClass()));
			main.run();

		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}