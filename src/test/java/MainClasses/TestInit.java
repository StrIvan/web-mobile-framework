package MainClasses;

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
if (isOSMac()){
setProperty("src/test/java/Drivers/chromedriver_97_mac");
}
else if (isOSWindows()){
    setProperty("src/test/java/Drivers/chromedriver_96_win.exe");
}
else {
    setProperty("src/test/java/Drivers/chromedriver_97_linux");
}
    driver = new ChromeDriver(options);
    if(headless) {
        driver.manage().window().setSize(new Dimension(1920, 1200));
    } else {
        driver.manage().window().maximize();
    }
}


    private void setProperty(String path) {
        System.setProperty("webdriver.chrome.driver", path);
        if (headless){
            options.addArguments("--headless");
        }
    }

    private boolean isOSWindows() {
        return getOSName().contains("win");
    }

    private boolean isOSMac() {
        return getOSName().contains("mac");
    }

    private String getOSName() {
        return System.getProperty("os.name").toLowerCase();
    }

    public void openUrl(String site) {
        driver.get(site);
    }

}

