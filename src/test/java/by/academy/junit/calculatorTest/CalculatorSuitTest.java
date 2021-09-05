package by.academy.junit.calculatorTest;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorDivTest.class, CalculatorMultipleTest.class, CalculatorSumTest.class, CalculatorParametrizeTest.class})
public class CalculatorSuitTest {
}
