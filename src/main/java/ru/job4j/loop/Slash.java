package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row == cell; /* добавить условие для левой диагонали - с левого верхнего угла в правый нижний*/
                boolean right = (row + cell) == (size - 1); /* добавить условие для правой диагонали - из левого нижнего в правый верхний*/
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        draw(5);
    }
}
