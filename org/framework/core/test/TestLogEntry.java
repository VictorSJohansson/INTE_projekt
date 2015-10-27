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


}
