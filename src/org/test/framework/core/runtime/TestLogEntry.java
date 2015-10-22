package org.test.framework.core.runtime;

import org.hamcrest.core.IsNull;
import org.junit.Test;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class TestLogEntry {
	
	LogEntry entry;
	
	@Before
	public void initialize(){
		entry = new LogEntry(null, null);
	}
	
	@Test
	public void testLogEntryConstructorIsNull_NullTestName(){
		assertThat(entry.getTestName(), IsNull.nullValue());
	}
	
	@Test
	public void testLogEntryConstructorIsNull_Value1IsNull(){
		assertThat(entry.getValue1(), IsNull.nullValue());
	}
	
	@Test
	public void testLogEntryConstructorIsNull_Value2IsNull(){
		assertThat(entry.getValue2(), IsNull.nullValue());
	}
	
	@Test
	public void testLogEntryTestName_TestNameIsCorrect(){
		LogEntry entry = new LogEntry("test", 1);
		assertEquals(entry.getTestName(), "test");
	}
	
	@Test
	public void testLogEntryValue_Value1IsCorrect(){
		LogEntry entry = new LogEntry("test", 1);
		assertEquals(entry.getValue1(), 1);
	}
	@Test
	public void testLogEntryValue_Value2IsCorrect(){
		LogEntry entry = new LogEntry("test", 1, 2);
		assertEquals(entry.getValue2(), 2);
	}

}
