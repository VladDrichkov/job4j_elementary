package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And20Then2() {
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(2, 0);
        double expected = 2.0;
        double output = firstPoint.distance(secondPoint);
        assertThat(output).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point firstPoint = new Point(-1, -1);
        Point secondPoint = new Point(1, 1);
        double expected = 2.83;
        double output = firstPoint.distance(secondPoint);
        assertThat(output).isCloseTo(expected, within(0.01));
    }

    @Test
    void  whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point firstPoint = new Point(-2, -2);
        Point secondPoint = new Point(2, 2);
        double expected = 5.66;
        double output = firstPoint.distance(secondPoint);
        assertThat(output).isEqualTo(expected, within(0.01));
    }

    @Test
    void whenPointsIn3DThenCalculateDistance() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double result = a.distance3d(b);
        assertThat(result).isCloseTo(1.732, within(0.001));
    }

    @Test
    void whenSamePointIn3DThenDistanceZero() {
        Point a = new Point(2, 3, 5);
        double result = a.distance3d(a);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void whenPointsOnZAxisThenDistance() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 5);
        double result = a.distance3d(b);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void whenNegativeCoordinatesIn3DThenDistance() {
        Point a = new Point(-1, -2, -3);
        Point b = new Point(-4, -5, -6);
        double result = a.distance3d(b);
        assertThat(result).isCloseTo(5.196, within(0.001));
    }

    @Test
    void whenOnePointIsOriginThenDistance() {
        Point origin = new Point(0, 0, 0);
        Point p = new Point(3, 4, 0);
        double result = origin.distance3d(p);
        assertThat(result).isEqualTo(5);
    }
}
