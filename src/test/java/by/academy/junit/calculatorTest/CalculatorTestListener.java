package by.academy.junit.calculatorTest;

import by.academy.junit.Calculator;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener {

    @Override
    public void testRunFinished(Result result) {
        System.out.println("The test is finished " + result.getRunCount());
    }
}
