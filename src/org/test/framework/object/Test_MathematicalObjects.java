package org.test.framework.object;
import java.awt.*;
import javafx.scene.shape.Circle;
import java.util.Arrays;

/**
 * This class is going to compare mathematical objects of the same kind with each other.
 * 
 * @author Pinar Larsson
 * @version 15/10/2015
 */
public class Test_MathematicalObjects
{

    /**
     * This method will compare two rectangles to determine if they are equal sized 
     * (can have different coordinates)
     * 
     */
    public static boolean equals_TwoRectangles(Rectangle a, Rectangle b)
    {
        double height1 = a.getHeight();
        double height2 = b.getHeight();
        double width1 = a.getWidth();
        double width2 = b.getWidth();
        int test1 = Double.compare(height1, height2);
        int test2 = Double.compare(width1, width2);
        return test1 == 0 && test2 == 0;
    }
    
     /**
     * This method will compare two rectangles to determine if they are equal (same coordinates and
     * same dimensions) 
     *
     * 
     */
    public static boolean identical_TwoRectangles(Rectangle a, Rectangle b)
    {
        double height1 = a.getHeight();
        double height2 = b.getHeight();
        double width1 = a.getWidth();
        double width2 = b.getWidth();
        int test1 = Double.compare(height1, height2);
        int test2 = Double.compare(width1, width2);
        return test1 == 0 && test2 == 0 && a.x == b.x && a.y == b.y;
    }
    
    /**
     * This method will determine if a rectangle is a square or not.
     * 
     *
     * 
     */
    public static boolean is_a_Square(Rectangle a)
    {
        int test = Double.compare(a.getHeight(), a.getWidth());
        return test == 0;
    }
    
        /**
     * This method will compare two circles to determine if they are equal sized 
     * (can have different coordinates)
     * 
     */
    public static boolean equals_TwoCircles(Circle a, Circle b)
    {
        double radius1 = a.getRadius();
        double radius2 = b.getRadius();

        int test = Double.compare(radius1, radius2);
        
        return test == 0;
    }
    
     /**
     * This method will compare two circles to determine if they are equal
     * 
     *
     * 
     */
    public static boolean identical_TwoCircles(Circle a, Circle b)
    {
        double radius1 = a.getRadius();
        double radius2 = b.getRadius();
        double x1 = a.getCenterX();
        double x2 = b.getCenterX();
        double y1 = a.getCenterY();
        double y2 = b.getCenterY();
        int test1 = Double.compare(radius1, radius2);
        int test2 = Double.compare(x1, x2);
        int test3 = Double.compare(y1, y2);
        return test1 == 0 && test2 == 0 && test3 == 0;
    
        
    }
    
         /**
     * This method will compare two polygons to determine if they are equal
     * 
     *
     * 
     */
    public static boolean identical_Polygons(Polygon a, Polygon b)
    {
        int a_n = a.npoints;
        int b_n = b.npoints;
        int[] a_xor = a.xpoints;
        int[] b_xor = b.xpoints;
        int[] a_yor = a.ypoints;
        int[] b_yor = b.ypoints;
        
        return Arrays.equals(a_xor, b_xor) && Arrays.equals(a_yor, b_yor) && a_n == b_n;
        
    }
}
