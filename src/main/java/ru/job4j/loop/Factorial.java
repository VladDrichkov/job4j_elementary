package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int factorial = 1;
        for (int i = n; i > 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(calc(23));
    }
}
