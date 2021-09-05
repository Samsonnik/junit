package by.academy.junit.calculatorTest;

import by.academy.junit.Calculator;
import org.junit.*;

public class CalculatorDivTest extends Assert {

    @BeforeClass
    public static void testStartMessage(){
        System.out.println("div test start");
    }

    @AfterClass
    public static void testFinishMessage(){
        System.out.println("div test finish");
    }

    @Test
    public void divTest(){
        for (int a = 1, b = a + 5; a < 100; a++) {
            assertEquals(b / a, Calculator.getDivide(b, a));
        }
    }
}
