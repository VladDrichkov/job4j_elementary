package ru.job4j.condition;

public class Max {

    public int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    public int findMax(int a, int b, int c) {
        return findMax(findMax(a, b), c);
    }

    public int findMax(int a, int b, int c, int d) {
        return findMax(findMax(a, b), findMax(c, d));
    }
}
