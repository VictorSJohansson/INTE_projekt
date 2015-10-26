
package org.test.framework;

import org.test.framework.core.runtime.OurFramework;
import org.test.framework.core.runtime.Test;

public class TestClassWithSetup implements Test {

	boolean setup = false;
	boolean teardown = false;
	
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

	@OurFramework
	public void testMethod()
	{

	}

}
