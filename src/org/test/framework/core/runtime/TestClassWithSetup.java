
package org.test.framework;

import org.test.framework.core.runtime.OurTest;
import org.test.framework.core.runtime.Test;

public class TestClassWithSetup implements Test {

	public boolean setup = false;
	public boolean teardown = false;
	@Override
	public void setup()
	{
		setup = true;
	}

	@Override
	public void teardown()
	{
		teardown = true;
	}

	@OurTest
	public void testMethod()
	{

	}

}
