package org.framework.core.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsNull;
import org.junit.Before;
import org.junit.Test;


public class TestFailTask {
	
	FailTask task;
	
	@Before
	public void initialize(){
		task = new FailTask(null, null, null);
	}
	
	@Test
	public void testFailTaskConstructorIsNull_NullTestName(){
		assertThat(task.getTaskName(), IsNull.nullValue());
	}

	@Test
	public void testFailTaskTestName_TestNameIsCorrect(){
		FailTask task = new FailTask("test", null, null);
		assertEquals(task.getTaskName(), "test");
	}
	
	@Test
	public void testFailTaskValue1IsCorrect(){
		FailTask task = new FailTask("test", 1, null);
		assertEquals(task.getValue1, 1);
	}
	
	public void testFailTaskValue2IsCorrect(){
		FailTask task = new FailTask("test", 1, 2);
		assertEquals(task.getValue2, 2);
	}
}
