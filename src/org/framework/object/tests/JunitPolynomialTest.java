package org.framework.object.tests;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.framework.object.*;

/**
 * The test class PolynomialTest.
 *
 * @author  Pinar Larsson
 * @version 25/10/2015
 */
public class JunitPolynomialTest
{
    

    
    /**
     * This method will test degree() method for the class Polynomial
     *
     * 
     */
    @Test
    public void test_Degree()
    {
        Polynomial p = new Polynomial(3,5);
        int d = p.degree();
        assertEquals(d,5);
    }

     /**
     * This method will test plus() method for the class Polynomial
     *
     * 
     */
    @Test
    public void test_Plus()
    {   Polynomial p = new Polynomial(3,5);
        Polynomial p_plus = p.plus(new Polynomial(7,9));
       
        int [] coef = p_plus.getCoef();
        
        assertEquals(p_plus.getDeg(),9);
        assertEquals(coef[9],7);
        assertEquals(coef[5],3);
    }
    
     /**
     * This method will test minus() method for the class Polynomial
     *
     * 
     */
    @Test
    public void test_Minus()
    {   Polynomial p = new Polynomial(3,5);
        Polynomial p_minus = p.minus(new Polynomial(7,5));
        assertEquals(p_minus.getDeg(),5);
        
        int [] coef = p_minus.getCoef();
        
        assertEquals(coef[5],-4);
        
    }
}
