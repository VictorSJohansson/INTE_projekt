package src.org.test.framework.object;
import java.awt.Rectangle;

/**
 * This class is going to compare mathematical objects of the same kind with each other.
 * 
 * @author Pinar Larsson
 * @version 15/10/2015
 */
public class Test_MathematicalObjects
{

    /**
     * This method will compare two rectangles to determine of they are equal sized 
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
    

}
