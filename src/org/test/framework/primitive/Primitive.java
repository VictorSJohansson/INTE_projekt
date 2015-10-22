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
	public static void equals(boolean x, boolean y){
		int a = Boolean.compare(x, y);
		if (a==0){
			return;
		}
		else{    
			fail("equals", x, y);
			return;
		}
	}
	
	//compare two booleans, return true if not equal
	public static void notEquals(boolean x, boolean y){
		int a = Boolean.compare(x,y);
		if(a!=0){
			return; 
		}
		else{
			fail("notEquals", x, y);
			return;
		}
	}
	
	//Byte**********************************************************************************************
	
	public static void equals(byte x, byte y) {
		// TODO Auto-generated method stub
		if (x==y){
			return;
		}
		else{
			fail("equals", x, y);
			return;
		}
	}

	public static void greater(byte x, byte y) {
		// TODO Auto-generated method stub
		if (x>y){
			return;
		}
		else{
			fail("greater", true, false);
			return;
		}
	}
	
	public static void less(byte x, byte y) {
		// TODO Auto-generated method stub
		if (x<y){
			return;
		}
		else{
			fail("less byte", true, false);
			return;
		}
	}

	public static void divisor(byte x, byte y) {
		// TODO Auto-generated method stub
		if (y%x == 0){
			return;
		}
		else{
			fail("divisor byte", true, false);
			return;
		}
	}
	
	//Short*********************************************************************************************
	
	public static void equals(short x, short y) {
		// TODO Auto-generated method stub
		if (y == x){
			return;
		}
		else{
			fail("equals short", true, false);
			return;
		}
		
	}

	public static void greater(short x, short y) {
		// TODO Auto-generated method stub
		if (x > y){
			return;
		}
		else{
			fail("greater short", true, false);
			return;
		}
		
	}
	
	public static void less(short x, short y) {
		// TODO Auto-generated method stub
		if (x < y){
			return;
		}
		else{
			fail("less short", true, false);
			return;
		}
	}

	public static void divisor(short x, short y) {
		// TODO Auto-generated method stub
		if (y%x == 0){
			return;
		}
		else{
			fail("divisor short", true, false);
			return;
		}
	}

	public static void valueWithinByteRange(short x) {
		// TODO Auto-generated method stub
		if(x < Byte.MIN_VALUE || x > Byte.MAX_VALUE){
			fail("valueWithinByteRange", true, false);
			return;
		}
		return;
	}
	
	//Int***********************************************************************************************
	
    /**
    * Following method tests if given integers x and y are equal to each other.
    */
   public static void equals(int x, int y)
   {  
       if (x == y){
			return;
		}
		else{
			fail("equals int", true, false);
			return;
		}
   
   }
    
   
   /**
    * Following method tests if, for given integers x and y, it holds that x is strictly greater than y.
    */
   public static void greater(int x, int y)
   {
       if (x > y){
			return;
		}
		else{
			fail("greater int", true, false);
			return;
		}
   }
   
    /**
    * Following method tests if, for given integers x and y, it holds that x is strictly less than y.
    */
   public static void less(int x, int y)
   {
       if (x < y){
			return;
		}
		else{
			fail("less int", true, false);
			return;
		}
   }
   
    /**
    * Following method tests if, for given integers x and y, it holds that x is a divisor of y.
    */
   public static void divisor(int x, int y)
   {
       if (y%x == 0){
			return;
		}
		else{
			fail("divisor int", true, false);
			return;
		}
   }
   
   public static void valueWithinShortRange(int x) { //added by John Thorelli 20/10/2015
		if(x < Short.MIN_VALUE || x > Short.MAX_VALUE){
			fail("valueWithinShortRange", true, false);
		}
		return;
   }
   
	public static void valueWithinByteRange(int x) { //added by John Thorelli 20/10/2015
		if(x < Byte.MIN_VALUE || x > Byte.MAX_VALUE){
			fail("valueWithinByteRange", true, false);
		}
		return;
	}
	
	//Long**********************************************************************************************
	
	/*
	 * This method checks to see if long x and long y holds the same value
	 * and returns true if they do, false otherwise.
	 */
	public static void equals(long x, long y){
		
		int a = Long.compare(x, y);
		if(a==1){
			return;
		}
		else {
			fail("equals long", true, false);
			return;
		}
	}
	
	/*
	 * This method returns true if long x is greater than long y.
	 */
	public static void greater(long x, long y){
		
		int a = Long.compare(x, y);
		if(a>0){
			return;
		}
		else {
			fail("long greater", true, false);
			return;
			}
	}
	
	/*
	 * Compares two longs and returns true if x is less than y.
	 */
	public static void less(long x, long y){
		
		int a = Long.compare(x, y);
		if(a<0){
			return;
		}
		else {
			fail("long less", true, false);
			return;
		}
	}
	
    public static void divisor(long x, long y) { //added by John Thorelli 20/10/2015
    	if (y%x == 0){
			return;
		}
		else{
			fail("divisor long", true, false);
			return;
		}
    }

	public static void valueWithinIntRange(long x) { //added by John Thorelli 20/10/2015
		if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE){
			fail("valueWithinIntRange long", true, false);
		}
		return;
	}

	public static void valueWithinShortRange(long x) { //added by John Thorelli 20/10/2015
		if(x < Short.MIN_VALUE || x > Short.MAX_VALUE){
			fail("valueWithinShortRange long", true, false);
		}
		return;
	}

	public static void valueWithinByteRange(long x) { //added by John Thorelli 20/10/2015
		if(x < Byte.MIN_VALUE || x > Byte.MAX_VALUE){
			fail("valueWithinByteRange long", true, false);
		}
		return;
	}
	
	//Float*********************************************************************************************
	
	public static void equals(short x, float y) {
		// TODO Auto-generated method stub
		if(y == x){
			return;
		}
		else {
			fail("equals short", true, false);
			return;
		}
	}

	public static void greater(float x, float y) {
		// TODO Auto-generated method stub
		if(x > y){
			return;
		}
		else {
			fail("greater short", true, false);
			return;
		}
	}
	
	public static void less(float x, float y) {
		// TODO Auto-generated method stub
		if(x < y){
			return;
		}
		else {
			fail("less float", true, false);
			return;
		}
	}

	public static void sameIntegerValue(float x, float y) {
		// TODO Auto-generated method stub
        int a = (int) x;
        int b = (int) y;
		if(a==b){
			return;
		}
		else {
			fail("sameIntegerValue float", true, false);
			return;
		}
    }
	
	//Doubble*******************************************************************************************
	
    /**
   * Following method tests if given doubles x and y are equal to each other.
   */
  public static void equals(double x, double y)
  {  
      int a = Double.compare(x, y);
      if(a == 0)
      return;
      else{
    	  fail("equals double", true, false);
    	  return;
      }
  }
   
  /**
   * Following method tests if, for given doubles x and y, it holds that x is greater than y.
   */
  public static void greater(double x, double y)
  {
      int a = Double.compare(x, y);
      if(a > 0)
      return;
      else{
    	  fail("greater double", true, false);
    	  return;
      }
  }
  
   /**
   * Following method tests if, for given doubles x and y, it holds that x is less than y.
   */
  public static void less(double x, double y)
  {
      int a = Double.compare(x, y);
      if(a < 0)
      return;
      else{
    	  fail("less double", true, false);
	      return;
	   }
  }

   /**
   * Following method tests if, for given doubles x and y, they have the same integer value.
   */
  public static void equalIntegerValue(double x, double y)
  {
      int a = (int) x;
      int b = (int) y;
      if(a == b){
    	  return;
      }
      else{
    	  fail("equalIntegerValue double", true, false);
    	  return;
      }
  }

	public static void valueWithinFloatRange(double x) { //added by John Thorelli 20/10/2015
		if(x < Float.MIN_VALUE || x > Float.MAX_VALUE){
			fail("valueWithinFloatRange double", true, false);
		}
		return;
	} 
	
	//Char**********************************************************************************************
	
    /* This method will compare two char.
     */
    public static void equals(char a, char b )
    {        
        if(a==b){
        	return;
        }
        else{
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
