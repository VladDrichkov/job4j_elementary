package ru.job4j.calculator;

public class TemperatureFit {

    public static double idealTemperatureForFruits(int temperature) {
        return temperature - 2.0;
    }

    public static double idealTemperatureForMeat(int temperature) {
        return temperature - 5.0;
    }

    public static void main(String[] args) {
        int temperature = 10;
        double fruits = TemperatureFit.idealTemperatureForFruits(temperature);
        double meat = TemperatureFit.idealTemperatureForMeat(temperature);
        System.out.println("Ideal temperature for fruits is " + fruits + "°C");
        System.out.println("Ideal temperature for meat is " + meat + "°C");
    }
}

