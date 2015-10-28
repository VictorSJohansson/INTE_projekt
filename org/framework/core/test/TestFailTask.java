package org.framework.core.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsNull;
import org.junit.Before;
import org.junit.Test;
import org.framework.core.runtime.FailTask;

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
		assertNotEquals(task.getTaskName(), "tesp");
	}
	
	@Test
	public void testFailTaskValue1IsCorrect(){
		FailTask task = new FailTask("test", 1, null);
		assertEquals(task.getValue1(), 1);
		assertNotEquals(task.getValue1(), 59);
	}
	
	@Test
	public void testFailTaskValue2IsCorrect(){
		FailTask task = new FailTask("test", 1, 2);
		assertEquals(task.getValue2(), 2);
		assertNotEquals(task.getValue2(), 7);
	}
	
	@Test
	public void testFailTasktoString(){
		FailTask task = new FailTask("test", 1, 2);
		String str = "FAILED: " + "test" + " " + 1 + " compared to " + 2;
		assertEquals(task.toString(), str);
	}
}
