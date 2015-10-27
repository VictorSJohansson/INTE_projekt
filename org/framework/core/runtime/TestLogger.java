package org.framework.core.runtime;

//import java.io.IOException;
//import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public class TestLogger {
	
	/*
	 * This class keeps track of all failed tests
	 */
	
	private static List <LogEntry> tests = new ArrayList<LogEntry>();;
	//private long start;
	//private long end;
	//private static List <Long> times;
	//private boolean makeFile = false;
	//private static boolean measureTestTime = false;
	
	//private constructor
	private TestLogger(){
		tests = new ArrayList<LogEntry>();
		//times = new ArrayList<Long>();
		

	}
	
	/*
	 * Adds a LogEntry to the arraylist for future printouts
	 */
	public static void appendEntry (LogEntry entry){
		tests.add(entry);
	}
	
	public static void appendSubtask(Subtask task){
		tests.get(tests.size-1).append(task);
	}
	
	/*
	 * Print information of failed tests to console
	 */
	public static void summary(){
		String timeStamp = new SimpleDateFormat("yyyy:MM:dd_HH:mm:ss").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
		for (LogEntry entry : tests){
			System.out.println(entry.getTestName() + " " + entry.getSubtasks.size() + " run, " + entry.getFails() + " failed.");
			for(Subtask task :LogEntry.getSubtasks)
			{
				System.out.println(task.getTaskName());
			}
				/*
			if (entry instanceof FailEntry){
				if(((FailEntry)entry).getValue2() != null){
					System.out.println("Failed method " + entry.getTestName() + ": " +((FailEntry)entry).getValue1() + " compared to " + ((FailEntry)entry).getValue2());
				}
				else{
					System.out.println("Failed test: " + entry.getTestName() + " " + ((FailEntry)entry).getValue1());
				}
			}
			else{
				System.out.println("Successful test: " + entry.getTestName());
			}*/
		}
	}
	
	public static int getSize(){
		return tests.size();
	}
	


	
	/*
	 * Save all test information to file
	 */
	/*
	public static void toFile(){
		try{
			String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		
		PrintWriter writer = new PrintWriter(timeStamp, "UTF-8");
		if (measureTestTime){
			for (int i=0; i<testNames.size(); i++){
				int testNo=i+1;
				writer.println(testNames.get(i) + "# " + testNo + "result: " + results.get(i) + " time: " + times.get(i));
			}
		}
		else{
			for (int i=0; i<testNames.size(); i++){
				int testNo=i+1;
				System.out.println(testNames.get(i) + " #" + testNo + " result: " + results.get(i));
			}
		}
		writer.close();
		}catch(IOException ie){
			ie.printStackTrace();
		}
		
	}
	
	public void setStart(long l){
		start = l;
	}
	
	public void setEnd(long l){
		end = l;
	}
	public void setMakeFile(boolean value){
		makeFile = value;
	}
	
	public void measureTime(boolean value){
		measureTestTime = value;
	}
	*/
	
	
	

}

