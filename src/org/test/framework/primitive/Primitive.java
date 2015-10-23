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
	
	//This method assures that the Object "obj" is a float number wrapper class
	public static boolean isAFloatNumber(Object obj) {
		if(obj instanceof Float)
			return true;
		if(obj instanceof Double)
			return true;
		return false;
	}
	
	//This method assures that the Object "obj" is a number wrapper class 
	private static boolean isANumber(Object obj) {
		if(obj instanceof Byte)
			return true;
		if(obj instanceof Short)
			return true;
		if(obj instanceof Integer)
			return true;
		if(obj instanceof Long)
			return true;
		return isAFloatNumber(obj);
	}
	
	//Booleans******************************************************************************************

	//compare two booleans, fails test if not equal
	public static void equals(boolean x, boolean y){
		int a = Boolean.compare(x, y);
		if (a!=0){   
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}
	}
	
	//compare two booleans, fails test if not equal
	public static void notEquals(boolean x, boolean y){
		int a = Boolean.compare(x,y);
		if(a==0){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}
	}
	
	//Byte**********************************************************************************************
	
	//compare two bytes, fail test if not equal
	public static void equals(byte x, byte y) {
		// TODO Auto-generated method stub
		if (x!=y){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}
	}
	
	//compare two bytes, fail test byte x is not greater than byte y
	public static void greater(byte x, byte y) {
		// TODO Auto-generated method stub
		if (x<y || x==y){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}
	}
	
	//compare two bytes, fails test if byte x is not smaller than byte y
	public static void less(byte x, byte y) {
		// TODO Auto-generated method stub
		if (x>y || x==y){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}
	}

	//compare two bytes, fails test if byte x divided by byte y leaves a remainder
	public static void divisor(byte x, byte y) {
		// TODO Auto-generated method stub
		if (y%x != 0){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}
	}
	
	//Compares a byte with an object, fails if that object is not a number equal to that byte
	public static void equals(byte b, Object obj) {
		short s;
		float f;
		if(isANumber(obj)) {
			if(isAFloatNumber(obj)) {
				f = (float)obj;
				if(f == b)
					return;
				s = (short)obj;
				if(s == b)
					return;
			}
		}
		fail(Thread.currentThread().getStackTrace()[1].getMethodName(), b, obj);
	}
    
	//Short*********************************************************************************************
	
	//compare two shorts. fails test if x and y do not hold the same value
	public static void equals(short x, short y) {
		// TODO Auto-generated method stub
		if (y != x){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}	
	}

	//compare two shorts. fails test if x is not greater than y
	public static void greater(short x, short y) {
		// TODO Auto-generated method stub
		if (x < y || x == y){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
			return;
		}
	}
	
	//compare two shorts. fail test if x is not lesser than y
	public static void less(short x, short y) {
		// TODO Auto-generated method stub
		if (x > y || x==y){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}
	}

	
	public static void divisor(short x, short y) {
		// TODO Auto-generated method stub
		if (y%x != 0){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x);
			return;
		}
	}

	public static void valueWithinByteRange(short x) {
		// TODO Auto-generated method stub
		if(x < Byte.MIN_VALUE || x > Byte.MAX_VALUE){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x);
		}
	}
	
	//Compares a short with an object, fails if that object is not a number equal to that short
		public static void equals(short s, Object obj) {
			int i;
			float f;
			if(isANumber(obj)) {
				if(isAFloatNumber(obj)) {
					f = (float)obj;
					if(f == s)
						return;
					i = (int)obj;
					if(i == s)
						return;
				}
			}
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), s, obj);
		}
	
	//Int***********************************************************************************************
	
    /**
    * Following method tests if given integers x and y are equal to each other.
    */
   public static void equals(int x, int y)
   {  
       if (x != y){
    	   fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}
   }
    
   
   /**
    * Following method tests if, for given integers x and y, it holds that x is strictly greater than y.
    */
   public static void greater(int x, int y)
   {
       if (x < y || x == y){
    	   fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}
   }
   
    /**
    * Following method tests if, for given integers x and y, it holds that x is strictly less than y.
    */
   public static void less(int x, int y)
   {
       if (x > y || x == y){
    	   fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}
   }
   
    /**
    * Following method tests if, for given integers x and y, it holds that x is a divisor of y.
    */
   public static void divisor(int x, int y)
   {
       if (y%x != 0){
    	   fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}
   }
   
   public static void valueWithinShortRange(int x) { //added by John Thorelli 20/10/2015
		if(x < Short.MIN_VALUE || x > Short.MAX_VALUE){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x);
		}
   }
   
	public static void valueWithinByteRange(int x) { //added by John Thorelli 20/10/2015
		if(x < Byte.MIN_VALUE || x > Byte.MAX_VALUE){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x);
		}
	}
	
	//Compares an int with an object, fails if that object is not a number equal to that int
			public static void equals(int i, Object obj) {
				long l;
				float f;
				if(isANumber(obj)) {
					if(isAFloatNumber(obj)) {
						f = (float)obj;
						if(f == i)
							return;
						l = (long)obj;
						if(l == i)
							return;
					}
				}
				fail(Thread.currentThread().getStackTrace()[1].getMethodName(), i, obj);
			}
	
	//Long**********************************************************************************************
	
	/*
	 * This method checks to see if long x and long y holds the same value
	 * and returns true if they do, false otherwise.
	 */
	public static void equals(long x, long y){
		
		int a = Long.compare(x, y);
		if(a!=1){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}
	}
	
	/*
	 * This method returns true if long x is greater than long y.
	 */
	public static void greater(long x, long y){
		
		int a = Long.compare(x, y);
		if(a<0 || a == 0){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}
	}
	
	/*
	 * Compares two longs and returns true if x is less than y.
	 */
	public static void less(long x, long y){
		
		int a = Long.compare(x, y);
		if(a>0 || a == 0){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}
	}
	
    public static void divisor(long x, long y) { //added by John Thorelli 20/10/2015
    	if (y%x != 0){
    		fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x);
		}
    }

	public static void valueWithinIntRange(long x) { //added by John Thorelli 20/10/2015
		if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x);
		}
	}

	public static void valueWithinShortRange(long x) { //added by John Thorelli 20/10/2015
		if(x < Short.MIN_VALUE || x > Short.MAX_VALUE){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x);
		}
	}

	public static void valueWithinByteRange(long x) { //added by John Thorelli 20/10/2015
		if(x < Byte.MIN_VALUE || x > Byte.MAX_VALUE){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x);
		}
	}
	
	//Compares a long with an object, fails if that object is not a number equal to that long
			public static void equals(long l, Object obj) {
				long l2;
				float f;
				if(isANumber(obj)) {
					if(isAFloatNumber(obj)) {
						f = (float)obj;
						if(f == l2)
							return;
						l2 = (long)obj;
						if(l2 == l)
							return;
					}
				}
				fail(Thread.currentThread().getStackTrace()[1].getMethodName(), l, obj);
			}
	
	//Float*********************************************************************************************
	
	public static void equals(short x, float y) {
		// TODO Auto-generated method stub
		if(y != x){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}
	}

	public static void greater(float x, float y) {
		// TODO Auto-generated method stub
		if(x < y || x == y){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}
	}
	
	public static void less(float x, float y) {
		// TODO Auto-generated method stub
		if(x > y || x == y){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}
	}

	public static void sameIntegerValue(float x, float y) {
		// TODO Auto-generated method stub
        int a = (int) x;
        int b = (int) y;
		if(a!=b){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
		}
    }
	
	//Compares a float with an object, fails if that object is not a number equal to that float
	public static void equals(float f, Object obj) {
		long l;
		float f2;
		if(isANumber(obj)) {
			if(isAFloatNumber(obj)) {
				f2 = (float)obj;
				if(f == f2)
					return;
				l = (long)obj;
				if(f == l)
					return;
			}
		}
		fail(Thread.currentThread().getStackTrace()[1].getMethodName(), f, obj);
	}
	
	//Doubble*******************************************************************************************
	
    /**
   * Following method tests if given doubles x and y are equal to each other.
   */
  public static void equals(double x, double y)
  {  
      int a = Double.compare(x, y);
      if(a != 0){
    	  fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
      }
  }
   
  /**
   * Following method tests if, for given doubles x and y, it holds that x is greater than y.
   */
  public static void greater(double x, double y)
  {
      int a = Double.compare(x, y);
      if(a < 0 || a == 0){
    	  fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
      }
  }
  
   /**
   * Following method tests if, for given doubles x and y, it holds that x is less than y.
   */
  public static void less(double x, double y)
  {
      int a = Double.compare(x, y);
      if(a > 0 || a == 0){
    	  fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
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
    	  fail(Thread.currentThread().getStackTrace()[1].getMethodName(), a, b);
      }
  }

	public static void valueWithinFloatRange(double x) { //added by John Thorelli 20/10/2015
		if(x < Float.MIN_VALUE || x > Float.MAX_VALUE){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x);
		}
	} 
	
	public static void valueWithinIntRange(double x) { //Test if the value of x is within Int range
		if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE)
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x);
	}
	
	//Compares a double with an object, fails if that object is not a number equal to that double
		public static void equals(double d, Object obj) {
			long l;
			double d2;
			if(isANumber(obj)) {
				if(isAFloatNumber(obj)) {
					d2 = (float)obj;
					if(d == d2)
						return;
					l = (long)obj;
					if(d == l)
						return;
				}
			}
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), d, obj);
		}
	
	//Char**********************************************************************************************
	
    /* This method will compare two char.
     */
    public static void equals(char a, char b )
    {        
        if(a!=b){
        	fail(Thread.currentThread().getStackTrace()[1].getMethodName(), a, b);
        }
    }
    
    //Byte-Short****************************************************************************************
    
    /*The following tests will support equals, greater and less between byte and short.
     * 
     */
    
    public static void equals(short s, byte b) {
    	if(b != s)
    		fail(Thread.currentThread().getStackTrace()[1].getMethodName(), s, b);
    }
    
    public static void greater(short s, byte b) {
    	if(s <= b)
    		fail(Thread.currentThread().getStackTrace()[1].getMethodName(), s, b);
    }
    
    //Fail**********************************************************************************************
    
    /*
     * This method creates and appends a LogEntry in the TestLogger with a failed test with
     * two parameters.
     */
    public static void fail(String testName, Object value1, Object value2){
    	
    	LogEntry entry = new LogEntry(testName, value1, value2);
    	TestLogger.append(entry);
    }
    
    /*
     * This method creates and appends a LogEntry in the TestLogger with a failed test with
     * one parameter.
     */
    public static void fail(String testName, Object value){
    	LogEntry entry = new LogEntry(testName, value);
    	TestLogger.append(entry);
    }
}
