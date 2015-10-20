package src.org.test.framework.primitive;


/**
 * This class is used to run tests concerning doubles.
 * 
 * @author Pinar Larsson
 * @version 12/10/2015
 */
public class TestDouble extends Primitive
{
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
}
