package ru.job4j.condition;

public class Max {

    public int findMax(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }

    public int findMax(int a, int b, int c, int d) {
        int maxOfThree = findMax(a, b, c);
        return (maxOfThree > d) ? maxOfThree : d;
    }

}
