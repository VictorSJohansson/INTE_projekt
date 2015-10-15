package src.org.test.framework.object;
import java.awt.Rectangle;



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
    
    Rectangle r1,r2; 
    /**
     * This method is going to test if equals_TwoRectangles() methid works properly
     */
    @Test
    public void test_equals_TwoRectangles(){
           
        r1 = new Rectangle(4,5);
        r2 = new Rectangle(5,5);
        
        assertTrue(Test_MathematicalObjects.equals_TwoRectangles(r1,r2));

    }


}