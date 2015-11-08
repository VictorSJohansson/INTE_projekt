package org.framework.object.tests;

import java.awt.*;
//import javafx.scene.shape.Circle;
import java.util.Arrays;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.framework.object.*;

/**
 * The test class for Test_MathematicalObjectsTest.
 *
 * @author  Pinar Larsson   
 * @version 15/10/2015
 */
public class JunitTest_MathematicalObjectsTest{
    
    
    /**
     * This method is going to test if equals_TwoRectangles() method works properly
     */
    @Test
    public void test_equals_TwoRectangles(){
           
        Rectangle r1 = new Rectangle(5,5,6,6);
        Rectangle r2 = new Rectangle(6,6);
        
        assertTrue(Test_MathematicalObjects.equals_TwoRectangles(r1,r2));
        
        r1 = new Rectangle(5,5,6,6);
        r2 = new Rectangle(5,7);
        
        assertFalse(Test_MathematicalObjects.equals_TwoRectangles(r1,r2));
        r2 = new Rectangle(7,6);
        assertFalse(Test_MathematicalObjects.equals_TwoRectangles(r2,r1));

    }
    
    /**
     * This method is going to test if identical_TwoRectangles() method works properly
     */
    @Test
    public void test_identical_TwoRectangles(){
           
        Rectangle r1 = new Rectangle(5,5,6,6);
        Rectangle r2 = new Rectangle(5,5,6,6);
        
        assertTrue(Test_MathematicalObjects.identical_TwoRectangles(r1,r2));
        
        r2 = new Rectangle(5,5,6,7);
        assertFalse(Test_MathematicalObjects.identical_TwoRectangles(r1,r2));
        r2 = new Rectangle(5,5,7,6);
        assertFalse(Test_MathematicalObjects.identical_TwoRectangles(r1,r2));
        r2 = new Rectangle(5,6,6,6);
        assertFalse(Test_MathematicalObjects.identical_TwoRectangles(r1,r2));
        r2 = new Rectangle(6,5,6,6);
        assertFalse(Test_MathematicalObjects.identical_TwoRectangles(r1,r2));
    }

    /**
     * This method is going to test if is_a_Square() method works properly
     */
    @Test
    public void test_is_a_Square(){
           
        Rectangle r = new Rectangle(5,9,6,6);
        
        assertTrue(Test_MathematicalObjects.is_a_Square(r));
        
        r = new Rectangle(5,9,6,7);
        
        assertFalse(Test_MathematicalObjects.is_a_Square(r));

    }
    
    /**
     * This method is going to test if equals_TwoCircles() method works properly
     */
//    @Test
//    public void test_equals_TwoCircles(){
//           
//        Circle c1 = new Circle(5,5,7);
//        Circle c2 = new Circle(5,5,7);
//        
//        assertTrue(Test_MathematicalObjects.equals_TwoCircles(c1,c2));
//
//    }
    
    /**
     * This method is going to test if identical_TwoCircles() method works properly
     */
//    @Test
//    public void test_identical_TwoCircles(){
//           
//        Circle c1 = new Circle(5,5,6);
//        Circle c2 = new Circle(5,5,6);
//        
//        assertTrue(Test_MathematicalObjects.identical_TwoCircles(c1,c2));
//
//    }
    
    /**
     * This method is going to test if identical_Polygons() method works properly
     */
    @Test
    public void test_identical_Polygons(){
        int[] p1_x = {1,2,3};
        int[] p2_x = {1,2,3};
        int[] p1_y = {4,5,6};
        int[] p2_y = {4,5,6};
        int[] p3_x = {2,3,4};
        int[] p3_y = {5,6,7};
        int[] p5_y = {5,6,7,9};
        
        Polygon p1 = new Polygon(p1_x,p1_y,3);
        Polygon p2 = new Polygon(p2_x,p2_y,3);
        
        assertTrue(Test_MathematicalObjects.identical_Polygons(p1,p2));
        
        p2 = new Polygon(p5_y, p5_y, 4);       
        assertFalse(Test_MathematicalObjects.identical_Polygons(p1,p2));
        
        p2 = new Polygon(p3_x, p1_y, 3);       
        assertFalse(Test_MathematicalObjects.identical_Polygons(p1,p2));
        
        p2 = new Polygon(p1_x, p3_y, 3);       
        assertFalse(Test_MathematicalObjects.identical_Polygons(p1,p2));
        
       // p2 = new Polygon(p2_x, p2_x, 3);       
        //assertFalse(Test_MathematicalObjects.identical_Polygons(p1,p2));

    }
}
    