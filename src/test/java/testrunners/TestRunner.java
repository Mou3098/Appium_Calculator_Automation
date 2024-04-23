package testrunners;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.CalculatorScreen;
import setup.Setup;

public class TestRunner extends Setup {
    //private AndroidDriver driver;

    @Test(priority = 1)
    public void doAddition() throws InterruptedException {
        CalculatorScreen calculatorScreen = new CalculatorScreen(driver);
        String res = calculatorScreen.doAdd();
        int result = Integer.parseInt(res);
        System.out.println("Test"+ res);
        Assert.assertEquals(3, result);
    }

    @Test(priority = 2)
    public void doSubtraction() throws InterruptedException {
        CalculatorScreen calculatorScreen = new CalculatorScreen(driver);
        String res = calculatorScreen.doMinus();
        int result = Integer.parseInt(res);
        System.out.println("Test"+ res);
        Assert.assertEquals(1, result);
    }
}
