import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {

    @Test
    public void shouldCalculateAddition() {
        ReversePolishNotationCalculator calc = new ReversePolishNotationCalculator();
        String expression = "1 2 +";
        Assertions.assertEquals(3,calc.calculatePolishNotation(expression));
    }

    @Test
    public void shouldCalculateSubtraction() {
        ReversePolishNotationCalculator calc = new ReversePolishNotationCalculator();
        String expression = "1 2 -";
        Assertions.assertEquals(-1,calc.calculatePolishNotation(expression));
    }

    @Test
    public void shouldCalculateMultiplication() {
        ReversePolishNotationCalculator calc = new ReversePolishNotationCalculator();
        String expression = "2 2 *";
        Assertions.assertEquals(4,calc.calculatePolishNotation(expression));
    }

    @Test
    public void shouldWorkWithNegativeNumbers() {
        ReversePolishNotationCalculator calc = new ReversePolishNotationCalculator();
        String expression = "-1 -2 + ";
        Assertions.assertEquals(-3,calc.calculatePolishNotation(expression));
    }

    @Test
    public void shouldWorkWithMultipleSpaces() {
        ReversePolishNotationCalculator calc = new ReversePolishNotationCalculator();
        String expression = " 1  2   +";
        Assertions.assertEquals(3,calc.calculatePolishNotation(expression));
    }

}
