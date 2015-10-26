package src.org.test.framework.object;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PolynomialTest.
 *
 * @author  Pinar Larsson
 * @version 25/10/2015
 */
public class PolynomialTest
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

    
}
