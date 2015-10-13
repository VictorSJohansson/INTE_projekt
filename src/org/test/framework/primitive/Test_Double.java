package src.org.test.framework.primitive;


/**
 * This class is used to run tests concerning doubles.
 * 
 * @author Pinar Larsson
 * @version 12/10/2015
 */
public class Test_Double extends Primitive
{
      /**
     * Following method tests if given doubles x and y are equal to each other.
     */
    public static boolean double_Equals(double x, double y)
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
    public static boolean double_Greater(double x, double y)
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
    public static boolean double_Less(double x, double y)
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
    public static boolean double_IntegerValue(double x, double y)
    {
        int a = (int) x;
        int b = (int) y;
        return a == b;
    }
   
}
