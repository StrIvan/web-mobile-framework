package MainClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage implements Expectations {
    int BASIC_TIME = 15;

    public WebDriver driver;

    @Override
public List<WebElement> waitVisibilityOfAllElementsLocatedBy(String locator){
        WebDriverWait wait = new WebDriverWait(driver, BASIC_TIME);
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
    }

    @Override
    public WebElement waitElementToBeClickable(String locator){
WebDriverWait wait = new WebDriverWait(driver, BASIC_TIME);
return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public  BasePage (WebDriver driver) {
        this.driver = driver;
    }
    public WebElement findElementByXpath(String locator) {
        return waitElementToBeClickable(locator);
    }
    public List<WebElement> findElementsByXpath(String locator) {
        return waitVisibilityOfAllElementsLocatedBy(locator);
    }
    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
