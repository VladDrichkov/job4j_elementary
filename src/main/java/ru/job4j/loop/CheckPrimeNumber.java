package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number <= 1) {
            return false;
        }
        boolean result = true;
        for (int i = 2; i <= number - 1; i++) {
            if (0 == number % i) {
                result = false;
                break;
            }
        }
        return result;
    }
}
