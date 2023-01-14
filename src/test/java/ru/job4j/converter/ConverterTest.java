package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RubleThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvertZeroRubleThenZeroEuro() {
        float in = 0;
        float expected = 0;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert140RubleThenZeroEuro() {
        float in = 140;
        float unexpected = 0;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertNotEquals(unexpected, out, eps);
    }

    @Test
    public void whenConvert200RubleThen2Dot85Euro() {
        float in = 200;
        float unexpected = 2.85f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertNotEquals(unexpected, out, eps);
    }

    @Test
    public void whenConvert200RblThen3dot3333Dlr() {
        float in = 200;
        float expected = 3.3333f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvertZeroRblThenZeroDlr() {
        float in = 0;
        float expected = 0;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert200RubleThenZeroDollar() {
        float in = 200;
        float unexpected = 0;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertNotEquals(unexpected, out, eps);
    }

    @Test
    public void whenConvert200RubleThen3Dot33Euro() {
        float in = 200;
        float unexpected = 3.33f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertNotEquals(unexpected, out, eps);
    }
}