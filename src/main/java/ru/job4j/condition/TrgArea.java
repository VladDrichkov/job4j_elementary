package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double a = 2;
        double b = 2;
        double c = 2;
        double resultTriangleArea = TrgArea.area(a, b, c);
        System.out.printf("The triangle area (%.2f, %.2f, %.2f) = %.2f", a, b, c, resultTriangleArea);
    }
}
