package src.org.test.framework.object;
import java.util.*;


/**
 * This class will test if two polynomials are equal or not.
 * 
 * @author Pinar Larsson
 * @version 25/10/2015
 */
public class Test_polynomials extends Object
{

     /**
     * This method will compare the coefficients oftwo polynomials to determine if they are equal. 
     * (coefficients are double)
     * 
     */
    public static boolean equals_Test(Polynomial p1, Polynomial p2)
    {
        
        if (p1.deg != p2.deg){ 
            return false;
        }
        else if(Arrays.equals(p1.coef,p2.coef)){
            return true;
        }
        else{
            return false;
        }
        

        
    }
    
}

    