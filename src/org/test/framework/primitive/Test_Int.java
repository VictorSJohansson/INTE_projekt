package src.org.test.framework.primitive;


/**
 * This class is used to run tests concerning int
 * 
 * @author Pinar Larsson
 * @version 11/10/2015
 */
public class Test_Int extends Primitive
{   

     /**
     * Following method tests if given integers x and y are equal to each other.
     */
    public static boolean int_Equals(int x, int y)
    {  
        return x == y;
    
    }
     
    
    /**
     * Following method tests if, for given integers x and y, it holds that x is strictly greater than y.
     */
    public static boolean int_Greater(int x, int y)
    {
        return x > y;
    }
    
     /**
     * Following method tests if, for given integers x and y, it holds that x is strictly less than y.
     */
    public static boolean int_Less(int x, int y)
    {
        return x < y;
    }
    
     /**
     * Following method tests if, for given integers x and y, it holds that x is a divisor of y.
     */
    public static boolean int_Divisor(int x, int y)
    {
        return y%x == 0;
    }
}
