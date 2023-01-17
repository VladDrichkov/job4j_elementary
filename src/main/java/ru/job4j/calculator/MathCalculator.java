package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double substractAndDivide(double first, double second) {
        return substract(first, second) + divide(first, second);
    }

    public static double sumOfFourArithmetic(double first, double second) {
        return sum(first, second) + substract(first, second)
                + multiply(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("результат расчета равен: " + sumAndMultiply(10, 20));
    }
}
