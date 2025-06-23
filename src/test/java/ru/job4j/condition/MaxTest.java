package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenFindMaxOfThreeThenReturnMax() {
        Max max = new Max();
        int result = max.findMax(1, 5, 3);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void whenFindMaxOfThreeWithNegativeNumbers() {
        Max max = new Max();
        int result = max.findMax(-10, -5, -1);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void whenFindMaxOfThreeWithEqualNumbers() {
        Max max = new Max();
        int result = max.findMax(7, 7, 7);
        assertThat(result).isEqualTo(7);
    }

    @Test
    void whenFindMaxOfFourThenReturnMax() {
        Max max = new Max();
        int result = max.findMax(10, 5, 8, 15);
        assertThat(result).isEqualTo(15);
    }

    @Test
    void whenFindMaxOfFourWithNegativeNumbers() {
        Max max = new Max();
        int result = max.findMax(-2, -5, -10, -1);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void whenFindMaxOfFourWithAllEqualNumbers() {
        Max max = new Max();
        int result = max.findMax(3, 3, 3, 3);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void whenFindMaxOfFourWhereFourthIsMax() {
        Max max = new Max();
        int result = max.findMax(1, 2, 3, 4);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void whenFindMaxOfFourWhereFirstIsMax() {
        Max max = new Max();
        int result = max.findMax(10, 2, 5, 7);
        assertThat(result).isEqualTo(10);
    }
}
