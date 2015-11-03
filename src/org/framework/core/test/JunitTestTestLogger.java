package org.framework.core.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.framework.core.runtime.LogEntry;
import org.framework.core.runtime.Subtask;
import org.framework.core.runtime.TestLogger;
import org.junit.Test;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class JunitTestTestLogger {
	
	//Make sure the constructor is private
	@Test
	public void testTestLoggerConstructorIsPrivate(){
		final Constructor<?>[] constructors = TestLogger.class.getDeclaredConstructors();
	    for (Constructor<?> constructor : constructors) {
	        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
	    }
	}
	
	@Test
	public void testTestLoggerAppendEntry(){
		TestLogger.appendEntry(new LogEntry(null));
		assertEquals(TestLogger.getSize(), 1);
		
	}
	
	@Test
	public void testTestLoggerAppendSubtask(){
		Subtask task = new Subtask("test");
		LogEntry entry = new LogEntry("test");
		TestLogger.appendEntry(entry);
		TestLogger.appendSubtask(task);
		ArrayList<Subtask> tasks = TestLogger.getLastEntry().getSubtask();
		assertEquals(task.getTaskName(), tasks.get(tasks.size() - 1).getTaskName());
	}
	
	@Test
	public void testTestLoggerGetSize(){
		assertEquals(TestLogger.getSize(), 0);
		TestLogger.appendEntry(new LogEntry(null));
		assertEquals(TestLogger.getSize(), 1);		
	}
	
	@Test
	public void testTestLoggerSummary(){
		String timeStamp = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(Calendar.getInstance().getTime());
		//assertEquals(TestLogger.summary(), timeStamp);
	}

}
