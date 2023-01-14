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

    public static boolean isEquals(float value1, float value2, float threshold) {
        return (Math.abs(value1 - value2) < threshold);
    }

    public static void main(String[] args) {
        float amountOfRubles = 140F;
        float amountOfEuro = rubleToEuro(amountOfRubles);
        float amountOfDollars = rubleToDollar(amountOfRubles);
        System.out.println(amountOfRubles + " rubles are " + amountOfEuro + " euro.");
        System.out.println(amountOfRubles + " rubles are " + amountOfDollars + " dollars.");

        float in = 140F;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("Test result: " + passed);

        float expectedDollarsValue = 2.3333F;
        float outDollarValue = Converter.rubleToDollar(in);
        final float EPSILON = 0.001f;
        passed = isEquals(expectedDollarsValue, outDollarValue, EPSILON);
        System.out.println("Test converter rubleToDollar: " + passed);
    }
}
