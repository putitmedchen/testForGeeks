import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestApp {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void methodTest(){
        driver.findElement(By.partialLinkText(""));
    }
}
