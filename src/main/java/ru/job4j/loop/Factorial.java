package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int factorial = 1;
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }
}
