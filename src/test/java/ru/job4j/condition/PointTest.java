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
}
