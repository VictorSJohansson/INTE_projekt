package org.framework.core.test;

import org.hamcrest.core.IsNull;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.framework.core.runtime.LogEntry;

import static org.junit.Assert.*;

public class TestLogEntry {
	
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
		FailTask task = new FailTask("task");
		assertEquals(task.getFails(), 1);
		assertNotEquals(task.getFails(), 10);
	}
	
	@Test
	public void testLogEntryAddTask(){
		entry = new LogEntry("test");
		Subtask task = new Subtask("task");
		assertThat(entry.getSubtasks().get(0) == task);
		
		FailTask task = new FailTask("task", 1, 1);
		assertThat(entry.getSubtasks().get(0) == task);
		
		SuccessfulTask task = new SuccessTask("task");
		assertThat(entry.getSubtasks().get(0) == task);
	}


}
