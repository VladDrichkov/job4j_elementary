package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        int resultIvan = ivan;
        int resultNik = nik;
        while (resultIvan <= resultNik) {
            resultIvan *= 3;
            resultNik *= 2;
            month += 1;
        }
        return month;
    }
}
