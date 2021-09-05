package by.academy.junit.calculatorTest;

import by.academy.junit.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class CalculatorParametrizeTest {

    private int firstValue;
    private int secondValue;
    private int expectedResult;

    public CalculatorParametrizeTest(int firstValue, int secondValue, int expectedResult) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.expectedResult = expectedResult;
    }

    @BeforeClass
    public static void testStartMessage() {
        System.out.println("parametrize test start");
    }

    @AfterClass
    public static void testFinishMessage() {
        System.out.println("parametrize test finish");
    }

    @Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
    public static Iterable<Object> dataForTest() {
        return Arrays.asList(new Object[][]{
                {1, 2, 3},
                {4, 5, 9},
                {6, 7, 13}
        });
    }

    @Test
    public void paramTest(){
        Assert.assertEquals(expectedResult, Calculator.getSum(firstValue, secondValue));
    }
}
