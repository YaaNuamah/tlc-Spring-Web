import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import turntabl.io.springwebservices.model.Maths;

import static org.junit.jupiter.api.Assertions.*;

class MathsTest {

    @Test
    void addPositiveNumbers() {
        Maths result = new Maths();
        Integer sum = result.addNumbers(5, 8);
        assertEquals(13, sum);
    }

    @Test
    void addNegativeNumbers() {
        Maths result = new Maths();
        Integer sum = result.addNumbers(-7, -8);
        assertEquals(-15, sum);
    }

    @Test
    void addNegativePositiveNumbers() {
        Maths result = new Maths();
        Integer sum = result.addNumbers(-10, 8);
        assertEquals(-2, sum);
    }

    @Test
    void subtractPositiveNumbers() {
        Maths result = new Maths();
        Integer difference = result.subtractNumbers(8, 4);
        assertEquals(4, difference);
    }

    @Test
    void subtractNegativeNumbers() {
        Maths result = new Maths();
        Integer difference = result.subtractNumbers(-7, -4);
        assertEquals(-3, difference);
    }

    @Test
    void subtractNegativePositiveNumbers() {
        Maths result = new Maths();
        Integer difference = result.subtractNumbers(-7, 4);
        assertEquals(-11, difference);
    }
}