package org.framework.object;
import java.util.*;


/**
 * Write a description of class Test_Second_Order_Polynomials here.
 * 
 * @author Pinar Larsson
 * @version 26/10/2015
 */
public class Test_Second_Degree_Polynomials extends Test_polynomials
{


    /**
     * This method will test if two second degree polynomials have a common root
     * 
     * 
     * 
     */
    public static boolean test_common_Root(Second_Degree_Polynomial p1,Second_Degree_Polynomial p2)
    {
        int test1 = Double.compare(p1.roots()[0],p2.roots()[0]);
        int test2 = Double.compare(p1.roots()[0],p2.roots()[1]); 
        int test3 = Double.compare(p1.roots()[1],p2.roots()[0]); 
        int test4 = Double.compare(p1.roots()[1],p2.roots()[1]);
        return test1 == 0 || test2 == 0 || test3 == 0 || test4 == 0;
    }
    
}
