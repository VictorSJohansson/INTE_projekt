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
	
	
	@Test
	public void testMainClass_Method_SendZeroParameterToMain()
	{
		Main m = new Main();
		m.addParameters(new String[]{});
		assertThat(m.getParameters().length(), is(0));
	}
}