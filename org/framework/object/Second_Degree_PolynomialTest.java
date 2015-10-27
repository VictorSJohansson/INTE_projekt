package org.framework.object;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * The test class Second_Degree_PolynomialTest.
 *
 * @author  Pinar Larsson
 * @version 26/10/2015
 */
public class Second_Degree_PolynomialTest
{


    
    /**
     * Tests roots method.
     *
     *
     */
    @Test
    public void test_Roots()
    {
        
    
        Second_Degree_Polynomial p = new Second_Degree_Polynomial(1,2,1);
        double[] assertion = {-1.0, -1.0};
        assertTrue(Arrays.equals(p.roots(), assertion));
    
    }
}
