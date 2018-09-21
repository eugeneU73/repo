package googleSimbirsoftTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class TestGoogleSimbirsoftPosition {

    private WebDriver driver;

    @Before
    public void start(){

        driver = ChromeWD.getWebDriverInstance();

    }
    @Test
    public void test(){
        driver.get("https://google.com");
        WebElement searchLine = driver.findElement(By.className("gsfi"));
        searchLine.sendKeys("Simbirsoft");
        WebElement searchButton = driver.findElement(By.className("sbqs_c"));
        searchButton.click();
        List<WebElement> searchResults = driver.findElements(By.className("bkWMgd"));
        assertTrue(searchResults.get(0).findElement(By.cssSelector("a")).getAttribute("href").equals("https://www.simbirsoft.com/"));
    }

    @After
    public void stop(){
        ChromeWD.closeWebBrowser();
    }


}
