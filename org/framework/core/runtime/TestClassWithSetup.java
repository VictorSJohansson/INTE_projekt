package org.framework.core.runtime;

import org.test.framework.core.runtime.OurFramework;
import org.test.framework.core.runtime.Test;

public class TestClassWithSetup implements Test {

	private boolean setup = false;
	private boolean teardown = false;
	
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

	public boolean getSetup()
	{
		return this.setup;
	}
	
	public boolean getTeardown()
	{
		return this.teardown;
	}
}
