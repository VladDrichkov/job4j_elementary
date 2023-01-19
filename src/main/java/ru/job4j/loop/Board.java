package ru.job4j.loop;

public class Board {

    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if (row % 2 == 0 && cell % 2 == 0) {
                    System.out.print("X");
                } else if (row % 2 == 0) {
                    System.out.print(" ");
                } else if (cell % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(5, 5);
    }
}
