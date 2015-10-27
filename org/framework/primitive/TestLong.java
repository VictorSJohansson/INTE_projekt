package org.framework.primitive;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * @author Victor Johansson
 * @version 13-10-2015
 */
public class TestLong {
	
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
}
