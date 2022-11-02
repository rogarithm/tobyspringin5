package springbook.learningtest.jdk;

import static org.assertj.core.api.Assertions.*;

import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;

public class ReflectionTest {

    @Test
    public void invokeMethod() throws Exception {
        String target = "Spring";

        // length()
        assertThat(target.length()).isEqualTo(6);

        Method lengthMethod = String.class.getMethod("length");
        assertThat((Integer) lengthMethod.invoke(target)).isEqualTo(6);

        // charAt()
        assertThat(target.charAt(0)).isEqualTo('S');

        Method charAtMethod = String.class.getMethod("charAt", int.class);
        assertThat((Character) charAtMethod.invoke(target, 0)).isEqualTo('S');
    }
}
