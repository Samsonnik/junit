package by.academy.junit.calculatorTest;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class TestRunner extends BlockJUnit4ClassRunner {

    private CalculatorTestListener calculatorTestListener;

    public TestRunner(Class testClass) throws InitializationError {
        super(testClass);
        calculatorTestListener = new CalculatorTestListener();
    }

    public void run(final RunNotifier notifier) {
        notifier.addListener(calculatorTestListener);
        super.run(notifier);
    }
}
