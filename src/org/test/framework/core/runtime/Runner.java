package org.test.framework.core.runtime;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	List<TestEngine> tests;
	
	public Runner()
	{
		tests = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	
	public void add(TestEngine test)
	{
		tests.add(test);
	}
	
	public void run(Result result)
	{
		for(TestEngine test : tests)
		{
			test.run(result);
		}
	}
}