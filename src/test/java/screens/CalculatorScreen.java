package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorScreen {
    public CalculatorScreen(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id ="com.google.android.calculator:id/digit_1")
    WebElement btn1;
    @FindBy(id ="com.google.android.calculator:id/digit_2")
    WebElement btn2;
    @FindBy(id ="com.google.android.calculator:id/op_add")
    WebElement btnPlus;
    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement btnMinus;
    @FindBy(id ="com.google.android.calculator:id/eq")
    WebElement btnEqual;
    @FindBy(id ="com.google.android.calculator:id/result_final")
    WebElement finalResult;
    @FindBy(id = "com.google.android.calculator:id/result_preview")
    WebElement result_preview;
    @FindBy(id = "com.google.android.calculator:id/clr")
    WebElement btnClear;


    public String doAdd() throws InterruptedException {
        btn1.click();
        btnPlus.click();
        btn2.click();
        btnEqual.click();
        Thread.sleep(2000);
        String result = finalResult.getText();
        System.out.println("Screen"+ result);
        return result;
    }
    public String doMinus() throws InterruptedException {
        btnClear.click();
        btn2.click();
        btnMinus.click();
        btn1.click();
        btnEqual.click();
        Thread.sleep(2000);
        String result = finalResult.getText();
        System.out.println("Screen"+ result);
        return result;
    }
}
