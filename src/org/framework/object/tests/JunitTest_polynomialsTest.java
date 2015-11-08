package org.framework.object.tests;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.framework.object.*;

/**
 * The test class Test_polynomialsTest.
 *
 * @author  Pinar Larsson
 * @version 25/10/2015
 */
public class JunitTest_polynomialsTest
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
        Polynomial p2 = (p.plus(new Polynomial(2,5))).minus(new Polynomial(1,9));
        assertTrue(Test_polynomials.equals_Test(p1,p2));
        
        Polynomial p3 = new Polynomial(3,5);
        Polynomial p4 = (p3.plus(new Polynomial(2,5))).minus(new Polynomial(1,9));
        Polynomial p5 = (p3.plus(new Polynomial(2,4))).minus(new Polynomial(1,9));
        assertFalse(Test_polynomials.equals_Test(p4,p5));
        
        Polynomial p6 = new Polynomial(7,8);
        Polynomial p7 = new Polynomial(2,4);
        assertFalse(Test_polynomials.equals_Test(p6,p7));
    }

    @Test
    public void test_Test_PolynaminalsConstructor(){
    	Test_polynomials t = new Test_polynomials();
    }
    
}
