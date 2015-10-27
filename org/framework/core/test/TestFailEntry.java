package org.framework.core.test;
import org.hamcrest.core.IsNull;
import org.junit.Test;
import org.junit.Before;
import org.framework.core.runtime.FailEntry;

import static org.junit.Assert.*;

public class TestFailEntry {	
		FailEntry entry;
		
		@Before
		public void initialize(){
			entry = new FailEntry(null, null, null);
		}
		
		@Test
		public void testFailEntryConstructorIsNull_NullTestName(){
			assertThat(entry.getTestName(), IsNull.nullValue());
		}
		
		@Test
		public void testFailEntryConstructorIsNull_Value1IsNull(){
			assertThat(entry.getValue1(), IsNull.nullValue());
		}
		
		@Test
		public void testFailEntryConstructorIsNull_Value2IsNull(){
			assertThat(entry.getValue2(), IsNull.nullValue());
		}
		
		@Test
		public void testFailEntryTestName_TestNameIsCorrect(){
			FailEntry entry = new FailEntry("test", null, null);
			assertEquals(entry.getTestName(), "test");
		}
		
		@Test
		public void testFailEntryValue_Value1IsCorrect(){
			FailEntry entry = new FailEntry("test", 1, 2);
			assertEquals(entry.getValue1(), 1);
		}
		@Test
		public void testFailEntryValue_Value2IsCorrect(){
			FailEntry entry = new FailEntry("test", 1, 2);
			assertEquals(entry.getValue2(), 2);
		}
}
