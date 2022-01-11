package MainClasses;

import org.testng.annotations.Test;

public class TestOne extends TestInit{
    @Test
    public void testOne(){
        openUrl("https://www.google.com.ua/?hl=ru");

    }
}
