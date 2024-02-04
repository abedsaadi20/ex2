package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Test class for TriangleClassifier
 */
public class AppTest {
	TriangleClassifier triangle= new TriangleClassifier();
	
    @Test
    public void testEquilateralTriangle() {
        int a = 2;
        int b = 2;
        int c = 2;
        triangle.classifyTriangle(a, b, c);
        Triangle_Types expected = Triangle_Types.equilateral;
        Triangle_Types result = triangle.getType();
        assertEquals(expected, result);
    }

    @Test
    public void testScaleneTriangle() {
        int a = 2;
        int b = 3;
        int c = 4;
        triangle.classifyTriangle(a, b, c);
        Triangle_Types expected = Triangle_Types.scalene;
        Triangle_Types result = triangle.getType();
        assertEquals(expected, result);
    }

    @Test
    public void testNotTriangle() {
        int a = 1;
        int b = 2;
        int c = 10;
        triangle.classifyTriangle(a, b, c);
        Triangle_Types expected = Triangle_Types.notTriangle;
        Triangle_Types result = triangle.getType();
        assertEquals(expected, result);
    }
    
    @Test
    public void testIsoscelesTriangle() {
        int a = 2;
        int b = 2;
        int c = 3;
        triangle.classifyTriangle(a, b, c);
        Triangle_Types expected = Triangle_Types.isosceles;
        Triangle_Types result = triangle.getType();
        assertEquals(expected, result);
    }
}
