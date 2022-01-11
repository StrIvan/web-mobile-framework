package MainClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class TestInit {
public WebDriver driver;
ChromeOptions options = new ChromeOptions();

    //    put false here if you want to see browser)
boolean headless = false;

@BeforeMethod
    public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver(options);
    if(headless) {
        driver.manage().window().setSize(new Dimension(1920, 1200));
    } else {
        driver.manage().window().maximize();
    }
}

    public void openUrl(String site) {
        driver.get(site);
    }

}

