package Assignment_01;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Circle s1 = new Circle(2, 3, 10, 4, 4, 4);
        double s2 = s1.calculateArea();
        System.out.println("Area of circle: " + s2);
        s1.calculateCircumference();
        Color a;
        a = new Color(12, 65, 34);
    }
}