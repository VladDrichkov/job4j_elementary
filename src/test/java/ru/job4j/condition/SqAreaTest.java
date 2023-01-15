package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenPerimeter6Ratio2Square2() {
        int perimeter = 6;
        double ratio = 2;
        int expectedSquare = 2;
        double outSquare = SqArea.square(perimeter, ratio);
        Assert.assertEquals(expectedSquare, outSquare, 0.01);
    }

    @Test
    public void whenPerimeter10Dot1RatioMinus2Dot1SquareMinus44Dot26() {
        double perimeter = 10.1;
        double ratio = -2.1;
        double expectedSquare = -44.26;
        double outSquare = SqArea.square(perimeter, ratio);
        Assert.assertEquals(expectedSquare, outSquare, 0.01);
    }

    @Test
    public void whenPerimeter10Dot1Ratio2Dot1Square44Dot0() {
        double perimeter = 10.1;
        double ratio = 2.1;
        double expectedSquare = 44.26;
        double outSquare = SqArea.square(perimeter, ratio);
        Assert.assertNotEquals(expectedSquare, outSquare, 0.01);
    }
}
