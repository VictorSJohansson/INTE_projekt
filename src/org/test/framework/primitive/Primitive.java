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

	//compare two booleans, fails test if not equal
	public static void equals(boolean x, boolean y){
		int a = Boolean.compare(x, y);
		if (a!=0){   
			fail("equals boolean", true, false);
		}
	}
	
	//compare two booleans, fails test if not equal
	public static void notEquals(boolean x, boolean y){
		int a = Boolean.compare(x,y);
		if(a==0){
			fail("notEquals", false, true);
		}
	}
	
	//Byte**********************************************************************************************
	
	//compare two bytes, fail test if not equal
	public static void equals(byte x, byte y) {
		// TODO Auto-generated method stub
		if (x!=y){
			fail("equals", x, y);
		}
	}
	
	//compare two bytes, fail test byte x is not greater than byte y
	public static void greater(byte x, byte y) {
		// TODO Auto-generated method stub
		if (x<y || x==y){
			fail("greater", true, false);
		}
	}
	
	//compare two bytes, fails test if byte x is not smaller than byte y
	public static void less(byte x, byte y) {
		// TODO Auto-generated method stub
		if (x>y || x==y){
			fail("less byte", true, false);
		}
	}

	//compare two bytes, fails test if byte x divided by byte y leaves a remainder
	public static void divisor(byte x, byte y) {
		// TODO Auto-generated method stub
		if (y%x != 0){
			fail("divisor byte", true, false);
		}
	}
	
	//Short*********************************************************************************************
	
	//compare two shorts. fails test if x and y do not hold the same value
	public static void equals(short x, short y) {
		// TODO Auto-generated method stub
		if (y != x){
			fail("equals short", true, false);
		}	
	}

	//compare two shorts. fails test if x is not greater than y
	public static void greater(short x, short y) {
		// TODO Auto-generated method stub
		if (x < y || x == y){
			fail("greater short", true, false);
			return;
		}
	}
	
	//compare two shorts. fail test if x is not lesser than y
	public static void less(short x, short y) {
		// TODO Auto-generated method stub
		if (x > y || x==y){
			fail("less short", true, false);
		}
	}

	
	public static void divisor(short x, short y) {
		// TODO Auto-generated method stub
		if (y%x != 0){
			fail("divisor short", true, false);
			return;
		}
	}

	public static void valueWithinByteRange(short x) {
		// TODO Auto-generated method stub
		if(x < Byte.MIN_VALUE || x > Byte.MAX_VALUE){
			fail("valueWithinByteRange", true, false);
		}
	}
	
	//Int***********************************************************************************************
	
    /**
    * Following method tests if given integers x and y are equal to each other.
    */
   public static void equals(int x, int y)
   {  
       if (x != y){
			fail("equals int", true, false);
		}
   }
    
   
   /**
    * Following method tests if, for given integers x and y, it holds that x is strictly greater than y.
    */
   public static void greater(int x, int y)
   {
       if (x < y || x == y){
			fail("greater int", true, false);
		}
   }
   
    /**
    * Following method tests if, for given integers x and y, it holds that x is strictly less than y.
    */
   public static void less(int x, int y)
   {
       if (x > y || x == y){
			fail("less int", true, false);
		}
   }
   
    /**
    * Following method tests if, for given integers x and y, it holds that x is a divisor of y.
    */
   public static void divisor(int x, int y)
   {
       if (y%x != 0){
			fail("divisor int", true, false);
		}
   }
   
   public static void valueWithinShortRange(int x) { //added by John Thorelli 20/10/2015
		if(x < Short.MIN_VALUE || x > Short.MAX_VALUE){
			fail("valueWithinShortRange", true, false);
		}
   }
   
	public static void valueWithinByteRange(int x) { //added by John Thorelli 20/10/2015
		if(x < Byte.MIN_VALUE || x > Byte.MAX_VALUE){
			fail("valueWithinByteRange", true, false);
		}
	}
	
	//Long**********************************************************************************************
	
	/*
	 * This method checks to see if long x and long y holds the same value
	 * and returns true if they do, false otherwise.
	 */
	public static void equals(long x, long y){
		
		int a = Long.compare(x, y);
		if(a!=1){
			fail("equals long", true, false);
		}
	}
	
	/*
	 * This method returns true if long x is greater than long y.
	 */
	public static void greater(long x, long y){
		
		int a = Long.compare(x, y);
		if(a<0 || a == 0){
			fail("long greater", true, false);
		}
	}
	
	/*
	 * Compares two longs and returns true if x is less than y.
	 */
	public static void less(long x, long y){
		
		int a = Long.compare(x, y);
		if(a>0 || a == 0){
			fail("long less", true, false);
		}
	}
	
    public static void divisor(long x, long y) { //added by John Thorelli 20/10/2015
    	if (y%x != 0){
			fail("divisor long", true, false);
		}
    }

	public static void valueWithinIntRange(long x) { //added by John Thorelli 20/10/2015
		if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE){
			fail("valueWithinIntRange long", true, false);
		}
	}

	public static void valueWithinShortRange(long x) { //added by John Thorelli 20/10/2015
		if(x < Short.MIN_VALUE || x > Short.MAX_VALUE){
			fail("valueWithinShortRange long", true, false);
		}
	}

	public static void valueWithinByteRange(long x) { //added by John Thorelli 20/10/2015
		if(x < Byte.MIN_VALUE || x > Byte.MAX_VALUE){
			fail("valueWithinByteRange long", true, false);
		}
	}
	
	//Float*********************************************************************************************
	
	public static void equals(short x, float y) {
		// TODO Auto-generated method stub
		if(y != x){
			fail("equals short", true, false);
		}
	}

	public static void greater(float x, float y) {
		// TODO Auto-generated method stub
		if(x < y || x == y){
			fail("greater short", true, false);
		}
	}
	
	public static void less(float x, float y) {
		// TODO Auto-generated method stub
		if(x > y || x == y){
			fail("less float", true, false);
		}
	}

	public static void sameIntegerValue(float x, float y) {
		// TODO Auto-generated method stub
        int a = (int) x;
        int b = (int) y;
		if(a!=b){
			fail("sameIntegerValue float", true, false);
		}
    }
	
	//Doubble*******************************************************************************************
	
    /**
   * Following method tests if given doubles x and y are equal to each other.
   */
  public static void equals(double x, double y)
  {  
      int a = Double.compare(x, y);
      if(a != 0){
    	  fail("equals double", true, false);
      }
  }
   
  /**
   * Following method tests if, for given doubles x and y, it holds that x is greater than y.
   */
  public static void greater(double x, double y)
  {
      int a = Double.compare(x, y);
      if(a < 0 || a == 0){
    	  fail("greater double", true, false);
      }
  }
  
   /**
   * Following method tests if, for given doubles x and y, it holds that x is less than y.
   */
  public static void less(double x, double y)
  {
      int a = Double.compare(x, y);
      if(a > 0 || a == 0){
    	  fail("less double", true, false);
	   }
  }

   /**
   * Following method tests if, for given doubles x and y, they have the same integer value.
   */
  public static void equalIntegerValue(double x, double y)
  {
      int a = (int) x;
      int b = (int) y;
      if(a != b){
    	  fail("equalIntegerValue double", true, false);
      }
  }

	public static void valueWithinFloatRange(double x) { //added by John Thorelli 20/10/2015
		if(x < Float.MIN_VALUE || x > Float.MAX_VALUE){
			fail("valueWithinFloatRange double", true, false);
		}
	} 
	
	//Char**********************************************************************************************
	
    /* This method will compare two char.
     */
    public static void equals(char a, char b )
    {        
        if(a!=b){
        	fail("equals char", true, false);
        }
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
