package src.org.test.framework.object;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Test_Second_Degree_PolynomialsTest.
 *
 * @author  Pinar Larsson
 * @version 26/10/2015
 */
public class Test_Second_Degree_PolynomialsTest
{
   


    /**
     * Tests the test_common_Root method.
     *
     * 
     */
    @Test
    public void test_Common_Root_test()
    {
        Second_Degree_Polynomial p1 = new Second_Degree_Polynomial(1,3,2);
        Second_Degree_Polynomial p2 = new Second_Degree_Polynomial(1,2,1);
        assertTrue(Test_Second_Degree_Polynomials.test_common_Root(p1,p2));
    }
}
