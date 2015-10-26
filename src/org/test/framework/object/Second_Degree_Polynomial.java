package src.org.test.framework.object;
import java.lang.Math;
import java.util.*;

/**
 * Write a description of class Second_Degree_Polynomial here.
 * 
 * @author Pinar Larsson 
 * @version 26/10/2015
 */
public class Second_Degree_Polynomial extends Polynomial
{
    
    
    double[] roots = new double[2];
    
    /**
     * Constructor for objects of class Second_Degree_Polynomial
     */
    public Second_Degree_Polynomial(int a, int b, int c)
    {
        super(new int[]{a,b,c},2);
    }

    /**
     * This method gives the roots of a given second degree polynomial
     * 
     *
     * 
     */
    public double[] roots()
    {
       
       roots[0]=(-this.coef[1]+Math.sqrt((this.coef[1]*this.coef[1])-4*this.coef[0]*this.coef[2]))/2;
       roots[1]=(-this.coef[1]-Math.sqrt((this.coef[1]*this.coef[1])-4*this.coef[0]*this.coef[2]))/2;
       return roots;
    }
    

}
