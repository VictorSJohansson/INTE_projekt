package src.org.test.framework.primitive;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Test_DoubleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestDoubleTest
{
    /**
     * This method tests if double_Equals(x,y) works.
     */
    @Test
    public void equals_Test()
    {
        assertTrue(TestDouble.double_Equals(1.5, 1.5));
        
    }
    
     /**
     * This method tests if double_Greater(x,y) works.
     */
    @Test
    public void greater_Test()
    {
        assertTrue(TestDouble.double_Greater(1.5, 1.4));
        
    }
    
    /**
     * This method tests if double_Less(x,y) works.
     */
    @Test
    public void less_Test()
    {
        assertTrue(TestDouble.double_Less(1.3, 1.4));
       
    }
    
    /**
     * This method tests if double_IntegerValue(x,y) works.
     */
    @Test
    public void integerValue_Test()
    {
        assertTrue(TestDouble.double_IntegerValue(2.3, 1.4));
       
    }
    }

