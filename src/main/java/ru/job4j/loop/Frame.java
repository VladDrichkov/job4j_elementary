package ru.job4j.loop;

public class Frame {

    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                boolean isTopOrBottom = row == 0 || row == size - 1;
                boolean isSide = col == 0 || col == size - 1;
                if (isTopOrBottom && isSide) {
                    System.out.print("+");
                } else if (isTopOrBottom) {
                    System.out.print("-");
                } else if (isSide) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Draw frame of size 3");
        draw(3);
        System.out.println("Draw frame of size 5");
        draw(5);
    }
}
