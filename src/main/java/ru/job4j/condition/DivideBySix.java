package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        boolean isDivideBy3 = number % 3 == 0;
        boolean isDivideBy2 = number % 2 == 0;
        if (isDivideBy3 && isDivideBy2) {
            rsl = "The number divides by 6.";
        } else if (isDivideBy3 && !isDivideBy2) {
            rsl = "The number divides by 3, but it isn't the even number.";
        } else if (!isDivideBy3 && isDivideBy2) {
            rsl = "The number doesn't divide by 3, but it is the even number.";
        } else {
            rsl = "The number doesn't divide by 3 and it isn't the even number.";
        }
        return rsl;
    }
}
