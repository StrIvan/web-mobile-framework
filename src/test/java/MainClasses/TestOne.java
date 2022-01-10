package MainClasses;

import org.testng.annotations.Test;

public class TestOne extends TestInit{
    @Test
    public void testOne(){
        driver.get("google.com");
        openUrl("google.com");

    }
}
