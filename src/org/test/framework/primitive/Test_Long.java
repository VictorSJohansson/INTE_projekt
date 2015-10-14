package org.test.framework.primitive;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * @author Victor Johansson
 * @version 13-10-2015
 */
public class Test_Long {
	
	/*
	 * This method checks to see if long x and long y holds the same value
	 * and returns true if they do, false otherwise.
	 */
	public static boolean long_Equals(long x, long y){
		
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
	public static boolean long_Greater(long x, long y){
		
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
	public static boolean long_Less(long x, long y){
		
		int a = Long.compare(x, y);
		if(a<0){
			return true;
		}
		else 
			return false;
	}

}
