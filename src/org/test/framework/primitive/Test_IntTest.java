package src.org.test.framework.primitive;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Test_IntTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Test_IntTest
{

    /**
     * This method tests if int_Equals(x,y) works.
     */
    @Test
    public void equals_Test()
    {
        assertTrue(Test_Int.int_Equals(Integer.MAX_VALUE,Integer.MAX_VALUE));
        
    }
    
    
    /**
     * This method tests if int_Greater(x,y) works.
     */
    @Test
    public void greater_Test()
    {
        assertTrue(Test_Int.int_Greater(5,3));
        
    }
    
     /**
     * This method tests if int_Less(x,y) works.
     */
    @Test
    public void less_Test()
    {
        assertTrue(Test_Int.int_Less(3,5));
        
    }
    
     /**
     * This method tests if int_Divisor(x,y) works.
     */
    @Test
    public void divisor_Test()
    {
        assertTrue(Test_Int.int_Divisor(3,6));
        
    }
}
