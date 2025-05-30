package ru.job4j.array;

public class TestArrays {

    public static void main(String[] args) {
        printDaysOfYear(2020, 2025);
    }

    public static int[] createDaysByYear(int start, int end) {
        int amountOfYears = end - start + 1;
        int[] days = new int[amountOfYears];
        int year = start;
        for (int i = 0; i < days.length; i++) {
            int numbersOfDays = 365;
            if (0 == year % 4) {
                numbersOfDays++;
            }
            days[i] = numbersOfDays;
            year++;
        }
        return days;
    }

    public static void printDaysOfYear(int start, int end) {
        int[] days = createDaysByYear(start, end);
        int year = start;
        for (int i = 0; i < days.length; i++) {
            System.out.println(year + ": " + days[i]);
            year++;
        }
    }
}
