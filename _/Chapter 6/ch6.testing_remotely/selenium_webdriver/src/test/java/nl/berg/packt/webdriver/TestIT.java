package nl.berg.packt.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.*; 
import java.io.File;
import java.io.IOException;
 
public class TestIT {
    private static final String WEBPAGE = "http://www.google.com";
    private static final String TITLE = "Google";
    private WebDriver driver;

    @BeforeSuite
    public void creatDriver(){
        this.driver= new HtmlUnitDriver(true);
    }

    @Test
    public void getLoginPageWithHTMLUNIT() throws IOException, InterruptedException {
        driver.get(WEBPAGE);
        System.out.println("TITLE IS ==>\""+driver.getTitle()+"\"");
        Assert.assertEquals(driver.getTitle(), TITLE);
    }

    @AfterSuite
    public void closeDriver(){
        driver.close();
    }
}



