package ru.job4j.condition;

public class AlertDivByZero {

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("could not div by zero");
        }
        if (number < 0) {
            System.out.println("this is negative number");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.possibleDiv(4);
        AlertDivByZero.possibleDiv(0);
        AlertDivByZero.possibleDiv(-1);
    }
}
