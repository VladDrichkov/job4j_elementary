package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        if (start <= finish) {
            for (int i = start; i <= finish; i++) {
                sum += i;
            }
        } else {
            for (int i = start; i >= finish; i--) {
                sum += i;
            }
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum;
        if (start <= finish && start % 2 != 0) {
            start += 1;
            sum = sumUpVia2(start, finish);
        } else if (start <= finish) {
            sum = sumUpVia2(start, finish);
        } else if (start % 2 != 0) {
            start -= 1;
            sum = sumDownVia2(start, finish);
        } else {
            sum = sumDownVia2(start, finish);
        }
        return sum;
    }

    private static int sumUpVia2(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i += 2) {
            sum += i;
        }
        return sum;
    }

    private static int sumDownVia2(int start, int finish) {
        int sum = 0;
        for (int i = start; i >= finish; i -= 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(0, -2));
    }
}
