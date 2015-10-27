package org.framework.core.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsNull;
import org.junit.Before;
import org.junit.Test;

public class TestSuccessfulTask {
FailTask task;
	
	@Before
	public void initialize(){
		task = new SuccessfulTask(null);
	}
	
	@Test
	public void testSuccessfulTaskConstructorIsNull_NullTestName(){
		assertThat(task.getTaskName(), IsNull.nullValue());
	}

	@Test
	public void testSuccessfulTaskTestName_TestNameIsCorrect(){
		Successful task = new SuccessfulTask("test");
		assertEquals(task.getTaskName(), "test");
	}
}
