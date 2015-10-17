package org.test.framework.object;
import java.awt.*;
import javafx.scene.shape.Circle;
import java.util.Arrays;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class for Test_MathematicalObjectsTest.
 *
 * @author  Pinar Larsson   
 * @version 15/10/2015
 */
public class Test_MathematicalObjectsTest{
    
    
    /**
     * This method is going to test if equals_TwoRectangles() method works properly
     */
    @Test
    public void test_equals_TwoRectangles(){
           
        Rectangle r1 = new Rectangle(5,5,6,6);
        Rectangle r2 = new Rectangle(6,6);
        
        assertTrue(Test_MathematicalObjects.equals_TwoRectangles(r1,r2));

    }
    
    /**
     * This method is going to test if identical_TwoRectangles() method works properly
     */
    @Test
    public void test_identical_TwoRectangles(){
           
        Rectangle r1 = new Rectangle(5,5,6,6);
        Rectangle r2 = new Rectangle(5,5,6,6);
        
        assertTrue(Test_MathematicalObjects.identical_TwoRectangles(r1,r2));

    }

    /**
     * This method is going to test if is_a_Square() method works properly
     */
    @Test
    public void test_is_a_Square(){
           
        Rectangle r = new Rectangle(5,9,6,6);
        
        assertTrue(Test_MathematicalObjects.is_a_Square(r));

    }
    
    /**
     * This method is going to test if equals_TwoCircles() method works properly
     */
    @Test
    public void test_equals_TwoCircles(){
           
        Circle c1 = new Circle(5,5,7);
        Circle c2 = new Circle(5,5,7);
        
        assertTrue(Test_MathematicalObjects.equals_TwoCircles(c1,c2));

    }
    
    /**
     * This method is going to test if identical_TwoCircles() method works properly
     */
    @Test
    public void test_identical_TwoCircles(){
           
        Circle c1 = new Circle(5,5,6);
        Circle c2 = new Circle(5,5,6);
        
        assertTrue(Test_MathematicalObjects.identical_TwoCircles(c1,c2));

    }
    
    /**
     * This method is going to test if identical_Polygons() method works properly
     */
    @Test
    public void test_identical_Polygons(){
        int[] p1_x = {1,2,3};
        int[] p2_x = {1,2,3};
        int[] p1_y = {4,5,6};
        int[] p2_y = {4,5,6};
        Polygon p1 = new Polygon(p1_x,p1_y,3);
        Polygon p2 = new Polygon(p2_x,p2_y,3);
        
        assertTrue(Test_MathematicalObjects.identical_Polygons(p1,p2));

    }
}
    