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
            if (coef[i] != 0){
            d = i; 
        }
        return d;
   
    }
  
    
    /**
     * This method will return the polynomial which is the sum of two polynomials. 
     * 
     * 
     */

    public Polynomial plus(Polynomial p2) {
        Polynomial p1 = this;
        Polynomial p3 = new Polynomial(0, Math.max(p1.deg, p2.deg));
        for (int i = 0; i <= p1.deg; i++) {
            p3.coef[i] += p1.coef[i];
        }
        for (int i = 0; i <= p2.deg; i++) {
            p3.coef[i] += p2.coef[i];
        }
        p3.deg = p3.degree();
        return p3;
    }

        /**
     * This method will return the polynomial which is the difference of two polynomials. 
     * 
     * 
     */
    
    public Polynomial minus(Polynomial p2) {
        Polynomial p1 = this;
        Polynomial p3 = new Polynomial(0, Math.max(p1.deg, p2.deg));
        for (int i = 0; i <= p1.deg; i++) {
            p3.coef[i] += p1.coef[i];
        }
        for (int i = 0; i <= p2.deg; i++) {
            p3.coef[i] -= p2.coef[i];
        }
        p3.deg = p3.degree();
        return p3;
    }


    



}

