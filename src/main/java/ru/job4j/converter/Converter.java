package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float amountOfRubles = 140F;
        float amountOfEuro = rubleToEuro(amountOfRubles);
        float amountOfDollars = rubleToDollar(amountOfRubles);
        System.out.println(amountOfRubles + " rubles are " + amountOfEuro + " euro.");
        System.out.println(amountOfRubles + " rubles are " + amountOfDollars + " dollars.");
    }
}
