package springbook.learningtest.template;

import java.io.IOException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcSumTest {

    @Test
    public void sumOfNumbers() throws IOException {
        Calculator calculator = new Calculator();
        int sum = calculator.calcSum(getClass().getResource("numbers.txt").getPath());
        Assertions.assertThat(sum).isEqualTo(10);
    }
}
