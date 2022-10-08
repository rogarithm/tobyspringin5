package springbook.learningtest.template;

import java.io.IOException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcSumTest {

    private Calculator calculator;
    private String numFilepath;

    @BeforeEach
    public void setUp() {
        this.calculator = new Calculator();
        this.numFilepath = getClass().getResource("numbers.txt").getPath();
    }

    @Test
    public void sumOfNumbers() throws IOException {
        Assertions.assertThat(calculator.calcSum(this.numFilepath)).isEqualTo(10);
    }

    @Test
    public void multiplyOfNumbers() throws IOException {
        Assertions.assertThat(calculator.calcMultiply(this.numFilepath)).isEqualTo(24);
    }
}
