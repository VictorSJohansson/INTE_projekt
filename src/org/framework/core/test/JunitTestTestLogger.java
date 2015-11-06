package org.framework.core.test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.framework.core.runtime.LogEntry;
import org.framework.core.runtime.Subtask;
import org.framework.core.runtime.SuccessfulTask;
import org.framework.core.runtime.FailTask;
import org.framework.core.runtime.TestLogger;
import org.junit.Test;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class JunitTestTestLogger {
	
	//Make sure the constructor is private
	@Test
	public void testTestLoggerConstructorIsPrivate() throws Exception{
		final Constructor<?>[] constructors = TestLogger.class.getDeclaredConstructors();
	    for (Constructor<?> constructor : constructors) {
	        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
	        constructor.setAccessible(true);
	        constructor.newInstance();
	    }
	}
	
	@Test
	public void testTestLoggerAppendSubtask_NoEntry(){

		TestLogger.flush();
		Subtask task = new Subtask("test245");
		TestLogger.appendSubtask(task);
		assertEquals(TestLogger.getSize(), 0);
		
	}
	
	@Test
	public void testTestLoggerAppendEntry(){
		
		LogEntry entry = new LogEntry(null);
		TestLogger.appendEntry(entry);
		assertEquals(TestLogger.getLastEntry().getTestName(), entry.getTestName());
		
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
		TestLogger.flush();
		assertEquals(TestLogger.getSize(), 0);
		TestLogger.appendEntry(new LogEntry(null));
		assertEquals(TestLogger.getSize(), 1);		
	}
	
	@Test
	public void testTestLoggerSummary(){
		TestLogger.flush();
		
		//Set up a failed LogEntry
		TestLogger.appendEntry(new LogEntry("entrytest"));
		TestLogger.appendSubtask(new SuccessfulTask("succesfulltask"));
		TestLogger.appendSubtask(new FailTask("failtask", 1, 2));
		
		//Set up a successful LogEntry
		TestLogger.appendEntry(new LogEntry("entrytest2"));
		TestLogger.appendSubtask(new SuccessfulTask("successfultask2"));
		
		ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
		PrintStream pStream = new PrintStream(byteStream);
		PrintStream oldPStream = System.out;
		System.setOut(pStream);
		
		TestLogger.summary();
		
		System.out.flush();
		System.setOut(oldPStream);
		System.out.println(byteStream);
		
		/*
		 * 2 tests run
entrytest:	: FAILED 2 run, 1 failed.
  -succesfulltask
  --FAILED:		failtask 1 compared to 2
entrytest2:	1 run, 0 failed.
  -successfultask2
		 */

		String expectedString = "2 tests run\n"
				+ "entrytest:	 FAILED 2 run, 1 failed.\n"
				+ "  -succesfulltask\n"
				+ "  --FAILED:		failtask 1 compared to 2\n"
				+ "entrytest2:	1 run, 0 failed.\n"
				+ "  -successfultask2\n";
		System.out.println(expectedString);
		assertEquals(byteStream.toString(), expectedString);
		
		
		//assertEquals(TestLogger.summary(), timeStamp);
	}
	
	@Test
	public void testTestLoggerFlushFunctionality(){
		TestLogger.appendEntry(new LogEntry(null));
		assertNotEquals(TestLogger.getSize(), 0);
		TestLogger.flush();
		assertEquals(TestLogger.getSize(), 0);
	}

}
