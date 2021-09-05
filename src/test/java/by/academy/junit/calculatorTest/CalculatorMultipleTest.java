package by.academy.junit.calculatorTest;

import by.academy.junit.Calculator;
import org.junit.*;

public class CalculatorMultipleTest extends Assert {

    @BeforeClass
    public static void testStartMessage(){
        System.out.println("multiple test start");
    }

    @AfterClass
    public static void testFinishMessage(){
        System.out.println("multiple test finish");
    }

    @Test
    public void multipleTest(){
        for (int a = 1, b = a + 1; a < 100; a++) {
            assertEquals(a * b, Calculator.getMultiple(a, b));
        }
    }
}
