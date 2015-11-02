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

public class JunitTestMain
{
	private Main main;
	
	@Before
	public void createMainObject()
	{
		main = new Main();
	}
	
	@Test
	public void testMainClass_Method_getZeroParameterFromMain()
	{
		assertThat(main.getParameters().length, is(0));
	}

	@Test
	public void testMainClass_Method_addOneParameterToMain()
	{
		main.addParameter("");
		assertThat(main.getParameters().length, is(1));
	}
}