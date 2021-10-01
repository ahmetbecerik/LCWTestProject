package testinium;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseModel extends Driver {

    WebDriverWait wait = new WebDriverWait(webDriver, 1000);


    public WebElement findElement(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return webDriver.findElement(by);
    }

    public void clickElement(By by) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    public void sendKeys(By by, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        findElement(by).sendKeys(text);
    }

    public boolean displayed(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return webDriver.findElement(by).isDisplayed();
    }

}