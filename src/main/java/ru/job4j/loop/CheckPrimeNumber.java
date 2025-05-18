package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean result = number > 1;
        for (int i = 2; i <= number - 1; i++) {
            if (0 == number % i) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 3;

        System.out.println(number + " :" + check(number));
    }
}
