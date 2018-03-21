import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void someTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("In test ...");
        Assert.assertTrue(true);
        if (driver!=null){
            driver.close();
            driver.quit();
        }
    }
}
