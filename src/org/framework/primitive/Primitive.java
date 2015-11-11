package org.framework.primitive;

import org.framework.core.runtime.TestLogger;
import org.framework.core.runtime.FailTask;
import org.framework.core.runtime.SuccessfulTask;

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
//	private static boolean isANumber(Object obj) {
//		if(obj instanceof Byte)
//			return true;
//		if(obj instanceof Short)
//			return true;
//		if(obj instanceof Integer)
//			return true;
//		if(obj instanceof Long)
//			return true;
//		return isAFloatNumber(obj);
//	}
	
	//Booleans******************************************************************************************

	//compare two booleans, fails test if not equal
	public static boolean equals(boolean x, boolean y){
		int a = Boolean.compare(x, y);
		if (a==0){ 
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
		else{
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
			return false;
		}
	}
	
	//compare two booleans, fails test if not equal
	public static boolean notEquals(boolean x, boolean y){
		int a = Boolean.compare(x,y);
		if(a!=0){
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
		else{
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
			return false;
		}
	}
	
	//Byte**********************************************************************************************
	
	//compare two bytes, fail test if not equal
	public static boolean equals(byte x, byte y) {
		// TODO Auto-generated method stub
		if (x==y){
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
		else{
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
			return false;
		}
	}
	
	//compare two bytes, fail test byte x is not greater than byte y
	public static boolean greater(byte x, byte y) {
		// TODO Auto-generated method stub
		if (x>y){
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
		else{
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
			return false;
		}
	}
	
	//compare two bytes, fails test if byte x is not smaller than byte y
	public static boolean less(byte x, byte y) {
		// TODO Auto-generated method stub
		if (x<y){
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
		else{
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
			return false;
		}
	}

	//compare two bytes, fails test if byte x divided by byte y leaves a remainder
	public static boolean divisor(byte x, byte y) {
		// TODO Auto-generated method stub
		if (y%x == 0){
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
		else{
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
			return false;
		}
	}
	
	//Compares a byte with an object, fails if that object is not a number equal to that byte
//	public static boolean equals(byte b, Object obj) {
//		short s;
//		float f;
//		if(isANumber(obj)) {
//			if(isAFloatNumber(obj)) {
//				f = (float)obj;
//				if(f == b) {
//					success(Thread.currentThread().getStackTrace()[1].getMethodName());
//					return true;
//				}
//				s = (short)obj;
//				if(s == b) {
//					success(Thread.currentThread().getStackTrace()[1].getMethodName());
//					return true;
//				}
//				
//			}
//		}
//		fail(Thread.currentThread().getStackTrace()[1].getMethodName(), b, obj);
//		return false;
//	}
	
	//Compares a byte with an object, fails if that object is not a number with a value less than that byte
//	public static boolean greater(byte b, Object obj) {
//		short s;
//		float f;
//		if(isANumber(obj)) {
//			if(isAFloatNumber(obj)) {
//				f = (float)obj;
//				if(b > f) {
//					success(Thread.currentThread().getStackTrace()[1].getMethodName());
//					return true;
//				}
//				else {
//					s = (short)obj;
//					if(b > s) {
//						success(Thread.currentThread().getStackTrace()[1].getMethodName());
//						return true;
//					}
//					else {
//						fail(Thread.currentThread().getStackTrace()[1].getMethodName(), b, obj);
//						return false;
//					}
//				}
//				
//				
//			}
//		}
//		fail(Thread.currentThread().getStackTrace()[1].getMethodName(), b, obj);
//		return false;
//	}
//	
//	//Compares a byte with an object, fails if that object is not a number with a value greater than that byte
//		public static boolean less(byte b, Object obj) {
//			short s;
//			float f;
//			if(isANumber(obj)) {
//				if(isAFloatNumber(obj)) {
//					f = (float)obj;
//					if(b < f) {
//						success(Thread.currentThread().getStackTrace()[1].getMethodName());
//						return true;
//					}
//					else {
//						s = (short)obj;
//						if(b < s) {
//							success(Thread.currentThread().getStackTrace()[1].getMethodName());
//							return true;
//						}
//						else {
//							fail(Thread.currentThread().getStackTrace()[1].getMethodName(), b, obj);
//							return false;
//						}
//					}
//					
//					
//				}
//			}
//			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), b, obj);
//			return false;
//		}
//    
	//Short*********************************************************************************************
	
	//compare two shorts. fails test if x and y do not hold the same value
	public static boolean equals(short x, short y) {
		// TODO Auto-generated method stub
		if (y == x){
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
		else{
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
			return false;
		}	
	}

	//compare two shorts. fails test if x is not greater than y
	public static boolean greater(short x, short y) {
		// TODO Auto-generated method stub
		if (x > y){
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
		else{
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
			return false;
		}
	}
	
	//compare two shorts. fail test if x is not lesser than y
	public static boolean less(short x, short y) {
		// TODO Auto-generated method stub
		if (x < y){
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
		else{
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
			return false;
		}
	}

	
	public static boolean divisor(short x, short y) {
		// TODO Auto-generated method stub
		if (y%x == 0){
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
		else{
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
			return false;
		}
	}

	public static boolean valueWithinByteRange(short x) {
		// TODO Auto-generated method stub
		if(x < Byte.MIN_VALUE || x > Byte.MAX_VALUE){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, null);
			return false;
		}
		else{
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
	}
	
	//Compares a short with an object, fails if that object is not a number equal to that short
//		public static boolean equals(short s, Object obj) {
//			int i;
//			float f;
//			if(isANumber(obj)) {
//				if(isAFloatNumber(obj)) {
//					f = (float)obj;
//					if(f == s) {
//						success(Thread.currentThread().getStackTrace()[1].getMethodName());
//						return true;
//					}
//					i = (int)obj;
//					if(i == s) {
//						success(Thread.currentThread().getStackTrace()[1].getMethodName());
//						return true;
//					}
//				}
//			}
//			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), s, obj);
//			return false;
//		}
//		
//		//Compares a short with an object, fails if that object is not a number with a value less than that short
//		public static boolean greater(short s, Object obj) {
//			int i;
//			float f;
//			if(isANumber(obj)) {
//				if(isAFloatNumber(obj)) {
//					f = (float)obj;
//					if(s > f) {
//						success(Thread.currentThread().getStackTrace()[1].getMethodName());
//						return true;
//					}
//					else {
//						i = (int)obj;
//						if(s > i) {
//							success(Thread.currentThread().getStackTrace()[1].getMethodName());
//							return true;
//						}
//						else {
//							fail(Thread.currentThread().getStackTrace()[1].getMethodName(), s, obj);
//							return false;
//						}
//					}
//					
//					
//				}
//			}
//			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), s, obj);
//			return false;
//		}
//		
//		//Compares a short with an object, fails if that object is not a number with a value greater than that short
//				public static boolean less(short s, Object obj) {
//					int i;
//					float f;
//					if(isANumber(obj)) {
//						if(isAFloatNumber(obj)) {
//							f = (float)obj;
//							if(s < f) {
//								success(Thread.currentThread().getStackTrace()[1].getMethodName());
//								return true;
//							}
//							else {
//								i = (int)obj;
//								if(s < i) {
//									success(Thread.currentThread().getStackTrace()[1].getMethodName());
//									return true;
//								}
//								else {
//									fail(Thread.currentThread().getStackTrace()[1].getMethodName(), s, obj);
//									return false;
//								}
//							}
//							
//							
//						}
//					}
//					fail(Thread.currentThread().getStackTrace()[1].getMethodName(), s, obj);
//					return false;
//				}
	
	//Int***********************************************************************************************
	
    /**
    * Following method tests if given integers x and y are equal to each other.
    */
   public static boolean equals(int x, int y)
   {  
       if (x == y){
    	   success(Thread.currentThread().getStackTrace()[1].getMethodName());
    	   return true;
       }
       else{
    	   fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
    	   return false;
		}
   }
    
   
   /**
    * Following method tests if, for given integers x and y, it holds that x is strictly greater than y.
    */
   public static boolean greater(int x, int y)
   {
       if (x > y){
    	   success(Thread.currentThread().getStackTrace()[1].getMethodName());
    	   return true;
       }
       else{
    	   fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
    	   return false;
		}
   }
   
    /**
    * Following method tests if, for given integers x and y, it holds that x is strictly less than y.
    */
   public static boolean less(int x, int y)
   {
       if (x < y){
    	   success(Thread.currentThread().getStackTrace()[1].getMethodName());
    	   return true;
       }
       else{
    	   fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
    	   return false;
		}
   }
   
    /**
    * Following method tests if, for given integers x and y, it holds that x is a divisor of y.
    */
   public static boolean divisor(int x, int y)
   {
       if (y%x == 0){
    	   success(Thread.currentThread().getStackTrace()[1].getMethodName());
    	   return true;
       }
       else{
    	   fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
    	   return false;
		}
   }
   
   public static boolean valueWithinShortRange(int x) { //added by John Thorelli 20/10/2015
		if(x < Short.MIN_VALUE || x > Short.MAX_VALUE){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, null);
			return false;
		}
		else{
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
   }
   
	public static boolean valueWithinByteRange(int x) { //added by John Thorelli 20/10/2015
		if(x < Byte.MIN_VALUE || x > Byte.MAX_VALUE){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, null);
			return false;
		}
		else{
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
	}
	
	//Compares an int with an object, fails if that object is not a number equal to that int
//	public static boolean equals(int i, Object obj) {
//		long l;
//		float f;
//		if(isANumber(obj)) {
//			if(isAFloatNumber(obj)) {
//				f = (float)obj;
//				if(f == i) {
//					success(Thread.currentThread().getStackTrace()[1].getMethodName());
//					return true;
//				}
//				l = (long)obj;
//				if(l == i) {
//					success(Thread.currentThread().getStackTrace()[1].getMethodName());
//					return true;
//				}
//			}
//		}
//		fail(Thread.currentThread().getStackTrace()[1].getMethodName(), i, obj);
//		return false;
//	}
//			
//	//Compares an int with an object, fails if that object is not a number with a value less than that int
//	public static boolean greater(int i, Object obj) {
//		long l;
//		float f;
//		if(isANumber(obj)) {
//			if(isAFloatNumber(obj)) {
//				f = (float)obj;
//				if(i > f) {
//					success(Thread.currentThread().getStackTrace()[1].getMethodName());
//					return true;
//				}
//				else {
//					l = (long)obj;
//					if(i > l) {
//						success(Thread.currentThread().getStackTrace()[1].getMethodName());
//						return true;
//					}
//					else {
//						fail(Thread.currentThread().getStackTrace()[1].getMethodName(), i, obj);
//						return false;
//					}
//				}
//				
//			}
//		}
//		fail(Thread.currentThread().getStackTrace()[1].getMethodName(), i, obj);
//		return false;
//	}
//	
//	//Compares an int with an object, fails if that object is not a number with a value greater than that int
//		public static boolean less(int i, Object obj) {
//			long l;
//			float f;
//			if(isANumber(obj)) {
//				if(isAFloatNumber(obj)) {
//					f = (float)obj;
//					if(i < f) {
//						success(Thread.currentThread().getStackTrace()[1].getMethodName());
//						return true;
//					}
//					else {
//						l = (long)obj;
//						if(i < l) {
//							success(Thread.currentThread().getStackTrace()[1].getMethodName());
//							return true;
//						}
//						else {
//							fail(Thread.currentThread().getStackTrace()[1].getMethodName(), i, obj);
//							return false;
//						}
//					}
//					
//				}
//			}
//			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), i, obj);
//			return false;
//		}
	
	//Long**********************************************************************************************
	
	/*
	 * This method checks to see if long x and long y holds the same value
	 * and returns true if they do, false otherwise.
	 */
	public static boolean equals(long x, long y){
		
		int a = Long.compare(x, y);
		if(a == 0){
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
		else{
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
			return false;
		}
	}
	
	/*
	 * This method returns true if long x is greater than long y.
	 */
	public static boolean greater(long x, long y){
		
		int a = Long.compare(x, y);
		if(a > 0){
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
		else{
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
			return false;
		}
	}
	
	/*
	 * Compares two longs and returns true if x is less than y.
	 */
	public static boolean less(long x, long y){
		
		int a = Long.compare(x, y);
		if(a < 0){
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
		else{
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
			return false;
		}
	}
	
    public static boolean divisor(long x, long y) { //added by John Thorelli 20/10/2015
    	if (y%x == 0){
    		success(Thread.currentThread().getStackTrace()[1].getMethodName());
    		return true;
    	}
    	else{
    		fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, null);
    		return false;
		}
    }

	public static boolean valueWithinIntRange(long x) { //added by John Thorelli 20/10/2015
		if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, null);
			return false;
		}
		else{
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
	}

	public static boolean valueWithinShortRange(long x) { //added by John Thorelli 20/10/2015
		if(x < Short.MIN_VALUE || x > Short.MAX_VALUE){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, null);
			return false;
		}
		else{
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
	}

	public static boolean valueWithinByteRange(long x) { //added by John Thorelli 20/10/2015
		if(x < Byte.MIN_VALUE || x > Byte.MAX_VALUE){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, null);
			return false;
		}
		else{
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
	}
	
	//Compares a long with an object, fails if that object is not a number equal to that long
//	public static boolean equals(long l, Object obj) {
//		long l2;
//		float f;
//		if(isANumber(obj)) {
//			if(isAFloatNumber(obj)) {
//				f = (float)obj;
//				if(f == l) {
//					success(Thread.currentThread().getStackTrace()[1].getMethodName());
//					return true;
//				}
//				l2 = (long)obj;
//				if(l2 == l) {
//					success(Thread.currentThread().getStackTrace()[1].getMethodName());
//					return true; 
//				}
//			}
//		}
//		fail(Thread.currentThread().getStackTrace()[1].getMethodName(), l, obj);
//		return false;
//	}
//			
//	//Compares a long with an object, fails if that object is not a number with a value less than that long
//	public static boolean greater(long l, Object obj) {
//		long l2;
//		float f;
//		if(isANumber(obj)) {
//			if(isAFloatNumber(obj)) {
//				f = (float)obj;
//				if(l > f) {
//					success(Thread.currentThread().getStackTrace()[1].getMethodName());
//					return true;
//				}
//				else {
//					l2 = (long)obj;
//					if(l > l2) {
//						success(Thread.currentThread().getStackTrace()[1].getMethodName());
//						return true; 
//					}
//					else {
//						fail(Thread.currentThread().getStackTrace()[1].getMethodName(), l, obj);
//						return false;
//					}
//				}
//				
//			}
//		}
//		fail(Thread.currentThread().getStackTrace()[1].getMethodName(), l, obj);
//		return false;
//	}
//	
//	//Compares a long with an object, fails if that object is not a number with a value greater than that long
//		public static boolean less(long l, Object obj) {
//			long l2;
//			float f;
//			if(isANumber(obj)) {
//				if(isAFloatNumber(obj)) {
//					f = (float)obj;
//					if(l < f) {
//						success(Thread.currentThread().getStackTrace()[1].getMethodName());
//						return true;
//					}
//					else {
//						l2 = (long)obj;
//						if(l < l2) {
//							success(Thread.currentThread().getStackTrace()[1].getMethodName());
//							return true; 
//						}
//						else {
//							fail(Thread.currentThread().getStackTrace()[1].getMethodName(), l, obj);
//							return false;
//						}
//					}
//					
//				}
//			}
//			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), l, obj);
//			return false;
//		}
	
	//Float*********************************************************************************************
	
	public static boolean equals(short x, float y) {
		// TODO Auto-generated method stub
		if(y == x){
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
		else{
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
			return false;
		}
	}

	public static boolean greater(float x, float y) {
		// TODO Auto-generated method stub
		if(x > y){
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
		else{
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
			return false;
		}
	}
	
	public static boolean less(float x, float y) {
		// TODO Auto-generated method stub
		if(x < y){
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
		else{
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
			return false;
		}
	}

	public static boolean sameIntegerValue(float x, float y) {
		// TODO Auto-generated method stub
        int a = (int) x;
        int b = (int) y;
		if(a==b){
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
		else{
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
			return false;
		}
    }
	
	//Compares a float with an object, fails if that object is not a number equal to that float
//	public static boolean equals(float f, Object obj) {
//		long l;
//		float f2;
//		if(isANumber(obj)) {
//			if(isAFloatNumber(obj)) {
//				f2 = (float)obj;
//				if(f == f2) {
//					success(Thread.currentThread().getStackTrace()[1].getMethodName());
//					return true;
//				}
//				l = (long)obj;
//				if(f == l) {
//					success(Thread.currentThread().getStackTrace()[1].getMethodName());
//					return true;
//				}
//			}
//		}
//		fail(Thread.currentThread().getStackTrace()[1].getMethodName(), f, obj);
//		return false;
//	}
//	
//	//Compares a float with an object, fails if that object is not a number with a value less than that float
//	public static boolean greater(float f, Object obj) {
//		long l;
//		float f2;
//		if(isANumber(obj)) {
//			if(isAFloatNumber(obj)) {
//				f2 = (float)obj;
//				if(f > f2) {
//					success(Thread.currentThread().getStackTrace()[1].getMethodName());
//					return true;
//				}
//				else {
//					l = (long)obj;
//					if(f > l) {
//						success(Thread.currentThread().getStackTrace()[1].getMethodName());
//						return true;
//					}
//					else {
//						fail(Thread.currentThread().getStackTrace()[1].getMethodName(), f, obj);
//						return false;
//					}
//				}
//				
//			}
//		}
//		fail(Thread.currentThread().getStackTrace()[1].getMethodName(), f, obj);
//		return false;
//	}
//	
//	//Compares a float with an object, fails if that object is not a number with a value greater than that float
//		public static boolean less(float f, Object obj) {
//			long l;
//			float f2;
//			if(isANumber(obj)) {
//				if(isAFloatNumber(obj)) {
//					f2 = (float)obj;
//					if(f < f2) {
//						success(Thread.currentThread().getStackTrace()[1].getMethodName());
//						return true;
//					}
//					else {
//						l = (long)obj;
//						if(f < l) {
//							success(Thread.currentThread().getStackTrace()[1].getMethodName());
//							return true;
//						}
//						else {
//							fail(Thread.currentThread().getStackTrace()[1].getMethodName(), f, obj);
//							return false;
//						}
//					}
//					
//				}
//			}
//			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), f, obj);
//			return false;
//		}
	
	//Doubble*******************************************************************************************
	
    /**
   * Following method tests if given doubles x and y are equal to each other.
   */
  public static boolean equals(double x, double y)
  {  
      int a = Double.compare(x, y);
      if(a == 0){
    	  success(Thread.currentThread().getStackTrace()[1].getMethodName());
    	  return true;
      }
      else{
    	  fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
    	  return false;
      }
  }
   
  /**
   * Following method tests if, for given doubles x and y, it holds that x is greater than y.
   */
  public static boolean greater(double x, double y)
  {
      int a = Double.compare(x, y);
      if(a > 0){
    	  success(Thread.currentThread().getStackTrace()[1].getMethodName());
    	  return true;
      }
      else{
    	  fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
    	  return false;
      }
  }
  
   /**
   * Following method tests if, for given doubles x and y, it holds that x is less than y.
   */
  public static boolean less(double x, double y)
  {
      int a = Double.compare(x, y);
      if(a < 0){
    	  success(Thread.currentThread().getStackTrace()[1].getMethodName());
    	  return true;
      }
      else{
    	  fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, y);
    	  return false;
	   }
  }

   /**
   * Following method tests if, for given doubles x and y, they have the same integer value.
   */
  public static boolean equalIntegerValue(double x, double y)
  {
      int a = (int) x;
      int b = (int) y;
      if(a == b){
    	  success(Thread.currentThread().getStackTrace()[1].getMethodName());
    	  return true;
      }
      else{
    	  fail(Thread.currentThread().getStackTrace()[1].getMethodName(), a, b);
    	  return false;
      }
  }

	public static boolean valueWithinFloatRange(double x) { //added by John Thorelli 20/10/2015
		if(x < Float.MIN_VALUE || x > Float.MAX_VALUE){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, null);
			return false;
		}
		else{
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
	} 
	
	public static boolean valueWithinIntRange(double x) { //Test if the value of x is within Int range
		if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE){
			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), x, null);
			return false;
		}
		else{
			success(Thread.currentThread().getStackTrace()[1].getMethodName());
			return true;
		}
	}
	
	//Compares a double with an object, fails if that object is not a number equal to that double
//		public static boolean equals(double d, Object obj) {
//			long l;
//			double d2;
//			if(isANumber(obj)) {
//				if(isAFloatNumber(obj)) {
//					d2 = (float)obj;
//					if(d == d2) {
//						success(Thread.currentThread().getStackTrace()[1].getMethodName());
//						return true;
//					}
//					l = (long)obj;
//					if(d == l) {
//						success(Thread.currentThread().getStackTrace()[1].getMethodName());
//						return true;
//					}
//				}
//			}
//			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), d, obj);
//			return false;
//		}
//		
//		//Compares a double with an object, fails if that object is not a number with a value less than that double
//		public static boolean greater(double d, Object obj) {
//			long l;
//			double d2;
//			if(isANumber(obj)) {
//				if(isAFloatNumber(obj)) {
//					d2 = (float)obj;
//					if(d > d2) {
//						success(Thread.currentThread().getStackTrace()[1].getMethodName());
//						return true;
//					}
//					else {
//						l = (long)obj;
//						if(d > l) {
//							success(Thread.currentThread().getStackTrace()[1].getMethodName());
//							return true;
//						}
//						else {
//							fail(Thread.currentThread().getStackTrace()[1].getMethodName(), d, obj);
//							return false;
//						}
//					}
//					
//				}
//			}
//			fail(Thread.currentThread().getStackTrace()[1].getMethodName(), d, obj);
//			return false;
//		}
//		
//		//Compares a double with an object, fails if that object is not a number with a value greater than that double
//				public static boolean less(double d, Object obj) {
//					long l;
//					double d2;
//					if(isANumber(obj)) {
//						if(isAFloatNumber(obj)) {
//							d2 = (float)obj;
//							if(d < d2) {
//								success(Thread.currentThread().getStackTrace()[1].getMethodName());
//								return true;
//							}
//							else {
//								l = (long)obj;
//								if(d < l) {
//									success(Thread.currentThread().getStackTrace()[1].getMethodName());
//									return true;
//								}
//								else {
//									fail(Thread.currentThread().getStackTrace()[1].getMethodName(), d, obj);
//									return false;
//								}
//							}
//							
//						}
//					}
//					fail(Thread.currentThread().getStackTrace()[1].getMethodName(), d, obj);
//					return false;
//				}
	
	//Char**********************************************************************************************
	
    /* This method will compare two char.
     */
    public static boolean equals(char a, char b )
    {        
        if(a==b){
        	success(Thread.currentThread().getStackTrace()[1].getMethodName());
        	return true;
        }
        else{
        	fail(Thread.currentThread().getStackTrace()[1].getMethodName(), a, b);
        	return false;
        }
    }
    
    //Byte-Short****************************************************************************************
    
    /*The following tests will support equals, greater and less between byte and short.
     * NOTE: These methods may be irrelevant after I've(John Thorelli) implemented the rest of the "method(primitiveType, Object)" methods
     */
    
    public static boolean equals(short s, byte b) {
    	if(b == s) {
    		success(Thread.currentThread().getStackTrace()[1].getMethodName());
    		return true;
    	}
    	else{
    		fail(Thread.currentThread().getStackTrace()[1].getMethodName(), s, b);
    		return false;
    	}
    }
    
    public static boolean greater(short s, byte b) {
    	if(s > b) {
    		success(Thread.currentThread().getStackTrace()[1].getMethodName());
    		return true;
    	}
    	else{
    		fail(Thread.currentThread().getStackTrace()[1].getMethodName(), s, b);
    		return false;
    	}
    }
    
    //Fail**********************************************************************************************
    
    /*
     * This method creates and appends a LogEntry in the TestLogger with a failed test with
     * two parameters.
     */
    public static void success(String testName){
    	TestLogger.appendSubtask(new SuccessfulTask(testName));
    }
    
    /*
     * This method creates and appends a LogEntry in the TestLogger with a failed test with
     * one parameter.
     */
    public static void fail(String testName, Object value1, Object value2){
    	TestLogger.appendSubtask(new FailTask(testName, value1, value2));
    }
    

}
