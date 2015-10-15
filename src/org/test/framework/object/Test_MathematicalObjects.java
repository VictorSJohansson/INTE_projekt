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
    public boolean equals_TwoRectangles(Rectangle a, Rectangle b)
    {

        double height1 = a.getHeight();
        double height2 = b.getHeight();
        double width1 = a.getWidth();
        double width2 = a.getWidth();
        int test_height = Double.compare(height1, width2);
        int test_width = Double.compare(width1, width2);
        return test_height == 0 && test_width == 0;
    }
}
