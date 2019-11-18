import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void givenTwoNumbersThenAddReturnsCorrectSum(){
        Calculator c = new Calculator();
        double sum = c.add(5, 2);
        Assertions.assertEquals(7, sum);
    }
}
