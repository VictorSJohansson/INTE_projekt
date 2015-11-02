package org.framework.core.test;

import org.hamcrest.core.IsNull;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matcher.*;

import org.framework.core.runtime.LogEntry;
import org.framework.core.runtime.FailTask;
import org.framework.core.runtime.SuccessfulTask;
import org.framework.core.runtime.Subtask;


import static org.junit.Assert.*;

public class JunitTestLogEntry {
	
	LogEntry entry;
	
	@Before
	public void initialize(){
		entry = new LogEntry(null);
	}
	
	@Test
	public void testLogEntryConstructorIsNull_NullTestName(){
		assertThat(entry.getTestName(), IsNull.nullValue());
	}

	@Test
	public void testLogEntryTestName_TestNameIsCorrect(){
		LogEntry entry = new LogEntry("test");
		assertEquals(entry.getTestName(), "test");
	}
	
	@Test
	public void testLogEntryGetFails(){
		entry = new LogEntry("test");
		entry.addTask(new FailTask("task", null, null));
		assertEquals(entry.getFails(), 1);
		assertNotEquals(entry.getFails(), 10);
	}
	
	@Test
	public void testLogEntryAddTask(){
		entry = new LogEntry("test");
		Subtask task = new Subtask("task");
		entry.addTask(task);
		
		assertThat(entry.getSubtask().get(0), is(task));
		
		task = new FailTask("task", 1, 1);
		entry.addTask(task);
		assertThat(entry.getSubtask().get(1), is(task));
		
		task = new SuccessfulTask("task");
		entry.addTask(task);
		assertThat(entry.getSubtask().get(2), is(task));
	}


}
