package by.academy.junit.calculatorTest;

import by.academy.junit.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;

@RunWith(TestRunner.class)
public class CalculatorSumTest extends Assert {

    @BeforeClass
    public static void testStartMessage(){
        System.out.println("sum test start");
    }

    @AfterClass
    public static void testFinishMessage(){
        System.out.println("sum test finish");
    }

    @Test
    public void divTest(){
        for (int a = 1, b = a + 1; a < 100; a++) {
            assertEquals(a + b, Calculator.getSum(a, b));
        }


    }
}