package org.framework.primitive;


/**
 * This class is used to run tests concerning int
 * 
 * @author Pinar Larsson
 * @version 11/10/2015
 */
public class TestInt extends Primitive
{   

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
}
