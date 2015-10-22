package org.test.framework.primitive;

import org.test.framework.core.runtime.TestLogger;
import org.test.framework.core.runtime.LogEntry;

/**
 * This class will contain test cases for all of javas primitive variables. 
 * 
 * @version 20/10/2015
 *
 */

public class Primitive {
	
	//Booleans******************************************************************************************

	//compare two booleans, return true if equal
	public static boolean equals(boolean x, boolean y){
		int a = Boolean.compare(x, y);
		if (a==0){
			return true;
		}
		else{    
			fail("equals", x, y);
			return false;
		}
	}
	
	//compare two booleans, return true if not equal
	public static boolean notEquals(boolean x, boolean y){
		int a = Boolean.compare(x,y);
		if(a!=0){
			return true; 
		}
		else{
			fail("notEquals", x, y);
			return false;
		}
	}
	
	//Byte**********************************************************************************************
	
	public static boolean equals(byte x, byte y) {
		// TODO Auto-generated method stub
		if (x==y){
			return true;
		}
		else{
			fail("equals", x, y);
			return false;
		}
	}

	public static boolean greater(byte x, byte y) {
		// TODO Auto-generated method stub
		if (x>y){
			return true;
		}
		else{
			fail("greater", true, false);
			return false;
		}
	}
	
	public static boolean less(byte x, byte y) {
		// TODO Auto-generated method stub
		return x < y;
	}

	public static boolean divisor(byte x, byte y) {
		// TODO Auto-generated method stub
		return y%x == 0;
	}
	
	//Short*********************************************************************************************
	
	public static boolean equals(short x, short y) {
		// TODO Auto-generated method stub
		return y == x;
	}

	public static boolean greater(short x, short y) {
		// TODO Auto-generated method stub
		return x > y;
	}
	
	public static boolean less(short x, short y) {
		// TODO Auto-generated method stub
		return x < y;
	}

	public static boolean divisor(short x, short y) {
		// TODO Auto-generated method stub
		return y%x == 0;
	}

	public static boolean valueWithinByteRange(short x) {
		// TODO Auto-generated method stub
		if(x < Byte.MIN_VALUE || x > Byte.MAX_VALUE)
			return false;
		return true;
	}
	
	//Int***********************************************************************************************
	
    /**
    * Following method tests if given integers x and y are equal to each other.
    */
   public static boolean equals(int x, int y)
   {  
       return x == y;
   
   }
    
   
   /**
    * Following method tests if, for given integers x and y, it holds that x is strictly greater than y.
    */
   public static boolean greater(int x, int y)
   {
       return x > y;
   }
   
    /**
    * Following method tests if, for given integers x and y, it holds that x is strictly less than y.
    */
   public static boolean less(int x, int y)
   {
       return x < y;
   }
   
    /**
    * Following method tests if, for given integers x and y, it holds that x is a divisor of y.
    */
   public static boolean divisor(int x, int y)
   {
       return y%x == 0;
   }
   
   public static boolean valueWithinShortRange(int x) { //added by John Thorelli 20/10/2015
		if(x < Short.MIN_VALUE || x > Short.MAX_VALUE)
			return false;
		return true;
   }
   
	public static boolean valueWithinByteRange(int x) { //added by John Thorelli 20/10/2015
		if(x < Byte.MIN_VALUE || x > Byte.MAX_VALUE)
			return false;
		return true;
	}
	
	//Long**********************************************************************************************
	
	/*
	 * This method checks to see if long x and long y holds the same value
	 * and returns true if they do, false otherwise.
	 */
	public static boolean equals(long x, long y){
		
		int a = Long.compare(x, y);
		if(a==1){
			return true;
		}
		else 
			return false;
	}
	
	/*
	 * This method returns true if long x is greater than long y.
	 */
	public static boolean greater(long x, long y){
		
		int a = Long.compare(x, y);
		if(a>0){
			return true;
		}
		else 
			return false;
	}
	
	/*
	 * Compares two longs and returns true if x is less than y.
	 */
	public static boolean less(long x, long y){
		
		int a = Long.compare(x, y);
		if(a<0){
			return true;
		}
		else 
			return false;
	}
	
    public static boolean divisor(long x, long y) { //added by John Thorelli 20/10/2015
        return y%x == 0;
    }

	public static boolean valueWithinIntRange(long x) { //added by John Thorelli 20/10/2015
		if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE)
			return false;
		return true;
	}

	public static boolean valueWithinShortRange(long x) { //added by John Thorelli 20/10/2015
		if(x < Short.MIN_VALUE || x > Short.MAX_VALUE)
			return false;
		return true;
	}

	public static boolean valueWithinByteRange(long x) { //added by John Thorelli 20/10/2015
		if(x < Byte.MIN_VALUE || x > Byte.MAX_VALUE)
			return false;
		return true;
	}
	
	//Float*********************************************************************************************
	
	public static boolean equals(short x, float y) {
		// TODO Auto-generated method stub
		return y == x;
	}

	public static boolean greater(float x, float y) {
		// TODO Auto-generated method stub
		return x > y;
	}
	
	public static boolean less(float x, float y) {
		// TODO Auto-generated method stub
		return x < y;
	}

	public static boolean sameIntegerValue(float x, float y) {
		// TODO Auto-generated method stub
        int a = (int) x;
        int b = (int) y;
        return a == b;
    }
	
	//Doubble*******************************************************************************************
	
    /**
   * Following method tests if given doubles x and y are equal to each other.
   */
  public static boolean equals(double x, double y)
  {  
      int a = Double.compare(x, y);
      if(a == 0)
      return true;
      else
      return false;
  }
   
  /**
   * Following method tests if, for given doubles x and y, it holds that x is greater than y.
   */
  public static boolean greater(double x, double y)
  {
      int a = Double.compare(x, y);
      if(a > 0)
      return true;
      else
      return false;
  }
  
   /**
   * Following method tests if, for given doubles x and y, it holds that x is less than y.
   */
  public static boolean less(double x, double y)
  {
      int a = Double.compare(x, y);
      if(a < 0)
      return true;
      else
      return false;
  }

   /**
   * Following method tests if, for given doubles x and y, they have the same integer value.
   */
  public static boolean equalIntegerValue(double x, double y)
  {
      int a = (int) x;
      int b = (int) y;
      return a == b;
  }

	public static boolean valueWithinFloatRange(double x) { //added by John Thorelli 20/10/2015
		if(x < Float.MIN_VALUE || x > Float.MAX_VALUE)
			return false;
		return true;
	} 
	
	//Char**********************************************************************************************
	
    /* This method will compare two char.
     */
    public static boolean equals(char a, char b )
    {        
        return a == b;
    }
    
    //Fail**********************************************************************************************
    
    /*
     * This method records a failed test in the TestLogger.
     */
    public static void fail(String testName, Object expected, Object actual){
  
    	LogEntry entry = new LogEntry(testName, expected, actual);
    	TestLogger.append(entry);
    }
}
