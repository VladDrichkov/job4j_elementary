package ru.job4j.condition;

public class SqArea {

    public static double square(double perimeter, double ratio) {
        double height = perimeter / (2 * (ratio + 1));
        double length = height * ratio;
        double square = length * height;
        return square;
    }

    public static void main(String[] args) {
        double perimeter = 6;
        double ratio = 2;
        double resultSquare = SqArea.square(perimeter, ratio);
        System.out.printf("perimeter = %.2f, ratio = %.2f, square = %.2f", perimeter, ratio, resultSquare);
    }
}
