import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }

    @Test
    void add() {
        int a = 1;
        int b = 2;
        double result = calculator.add(a, b);
        Assertions.assertEquals(3, result);

    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 2;
        double result = calculator.subtract(a, b);
        Assertions.assertEquals(-1, result);

    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }

    @Test
    void modulo() {
    }

    @Test
    void sum() {
    }
}