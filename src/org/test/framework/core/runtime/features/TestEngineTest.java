
package org.test.framework.core.runtime.features;

import static org.junit.Assert.*;
import static org.test.framework.core.runtime.features.TestEngine.*;

import org.junit.Test;
import org.test.framework.core.runtime.OurTest;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matcher.*;

public class TestEngineTest {

	TestEngine te;

	@Before
	public void initializeATestObject()
	{
		te = new TestEngineMock();
	}

	@Test
	public void test()
	{
//		assertThat(te.execute(this.getClass()).errorCount, is(1));
	}

	@OurTest
	public void testObject()
	{

	}

}
