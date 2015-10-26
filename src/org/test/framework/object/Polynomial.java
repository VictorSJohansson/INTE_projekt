package src.org.test.framework.object;


/**
 * This class constructs a polynomial.
 * 
 * @author Pinar Larsson
 * @version 25/10/2015
 */
public class Polynomial extends Object
{

    protected double[] coef;
    protected int deg;
    
         /**
     * This contructor will create the term c.x^n. 
     * 
     * 
     */
    public Polynomial(int c, int n) {
        coef = new double[n+1];
        coef[n] = c;
        deg = degree();
    }
    
    /**
     * This method will return the degree of a polynomial (0 for zero polynomial)
     * 
     */
    
    public int degree() {
        int d = 0;
        for (int i = 0; i < coef.length; i++)
            if (coef[i] != 0) 
            d = i;
        return d;
   
    }
    
    
    

    



}

