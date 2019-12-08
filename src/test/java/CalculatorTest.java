import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.w3c.dom.ls.LSOutput;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource({"2,3,5", "-5,5,0", "-2,-2,-4", "0,-3,-3"})
    public void givenTwoNumbersThenAddReturnsCorrectSum(double input1, double input2, double expected){
        Calculator c = new Calculator();
        double sum = c.add(input1, input2);
        Assertions.assertEquals(expected, sum);
    }

    @ParameterizedTest
    @CsvSource({"2,3,-1", "-5,5,-10", "-2,-2,0", "0,-3,3"})
    public void givenTwoNumbersThenSubtractReturnsCorrectSub(double input1, double input2, double expected){
        Calculator c = new Calculator();
        double subtract = c.subtract(input1, input2);
        Assertions.assertEquals(expected, subtract);
    }

    @Test
    public void givenSecondNumberIsZeroThenDivideDoesNotThrowException(){
        Assertions.assertDoesNotThrow(() -> {
            var c = new Calculator();
            var result = c.divide(9, 0);
            Assertions.assertEquals(0, result);
        });
    }

    @Test
    public void arrayLengthTest(){
        var c = new Calculator();
        var result = c.getArrayFromValues(2, 3);
        Assertions.assertEquals(2, result.length);
    }

    @BeforeEach
    public void initializeTest(){
        System.out.println("This is the beginning of a test");
    }

    @AfterEach
    public void cleanupTest(){
        System.out.println("Finishing the test");
    }
}
