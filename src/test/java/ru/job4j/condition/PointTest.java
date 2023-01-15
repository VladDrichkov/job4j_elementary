package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to51then5Dot09() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 1;
        double expected = 5.09;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00toMinus51then5Dot09() {
        int x1 = 0;
        int y1 = 0;
        int x2 = -5;
        int y2 = 1;
        double expected = 5.09;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to51then5Dot0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 1;
        double expected = 5.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertNotEquals(expected, out, 0.01);
    }
}