package org.test.framework.core.runtime;

import org.junit.Test;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matcher.*;

public class TestRuntime {

	Runtime rt;
	
	@Before
	public void initialize()
	{
		rt = new Runtime();
	}
	
	@Test
	public void testExecute_getMethodsWithAnnotation()
	{
		List<String> list = rt.getListOfAnnotationMethod(TestClass.class);
		assertThat(list.get(0), is("testMethod"));
	}
	
}
