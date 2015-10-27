package org.framework.core.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsNull;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.framework.core.runtime.SubTask;

public class TestSubtask {

	Subtask task;
	
	@Before
	public void initialize(){
		task = new Subtask(null);
	}
	
	@Test
	public void testSubtaskConstructorIsNull_NullTestName(){
		assertThat(task.getTaskName(), IsNull.nullValue());
	}

	@Test
	public void testSubtaskTestName_TestNameIsCorrect(){
		Subtask task = new Subtask("test");
		assertEquals(task.getTaskName(), "test");
	}

}
