package org.framework.object;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Test_polynomialsTest.
 *
 * @author  Pinar Larsson
 * @version 25/10/2015
 */
public class Test_polynomialsTest
{
   

    /**
     * This method will check if equals_Test method works
     *
     * 
     */
    @Test
    public void Test_equals_test()
    {
        Polynomial p = new Polynomial(3,5);
        Polynomial p1 = (p.plus(new Polynomial(2,5))).minus(new Polynomial(1,9));
        Polynomial p2 = (p.plus(new Polynomial(2,4))).minus(new Polynomial(1,9));
        assertTrue(Test_polynomials.equals_Test(p1,p2));
    }

    
}
