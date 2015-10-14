
package org.test.framework.core.runtime;

import org.junit.Test;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;
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
	public void testTestCaseClass_Constructor_NullConstructor()
	{

	}

}
