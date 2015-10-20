package org.test.framework.primitive;

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
		else    
			return false;
	}
	
	//compare two booleans, return true if not equal
	public static boolean notEquals(boolean x, boolean y){
		int a = Boolean.compare(x,y);
		if(a!=0){
			return true; 
		}
		else
			return false;
	}
	
	//Byte**********************************************************************************************
	
	public static boolean equals(byte x, byte y) {
		// TODO Auto-generated method stub
		return y == x;
	}

	public static boolean greater(byte x, byte y) {
		// TODO Auto-generated method stub
		return x > y;
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
	
	//Float*********************************************************************************************
	
	//Doubble*******************************************************************************************
	
	//Char**********************************************************************************************
}
