package Traingle_Casification_class_1.Traingle_Casification_class_1;

/**
 * Enum for triangle types
 */
enum Triangle_Types {
    equilateral,
    isosceles,
    scalene,
    notTriangle,
    ERROR
}

/**
 * Class for classifying triangles
 */
class TriangleClassifier {

    private static Triangle_Types triangle;

    public void classifyTriangle(int a, int b, int c) {
        if (isTriangle(a, b, c)) {
            if (isEquilateral(a, b, c)) {
                triangle = Triangle_Types.equilateral;
            } else if (isIsosceles(a, b, c)) {
                triangle = Triangle_Types.isosceles;
            } else {
                triangle = Triangle_Types.scalene;
            }
        } else {
            triangle = Triangle_Types.notTriangle;
        }
    }

    private static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    private static boolean isIsosceles(int a, int b, int c) {
        return a == b || b == c || a == c;
    }

    private static boolean isEquilateral(int a, int b, int c) {
        return a == b && b == c;
    }

    public Triangle_Types getType() {
        return triangle;
    }
}
