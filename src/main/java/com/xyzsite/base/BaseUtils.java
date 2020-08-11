package main.java.com.xyzsite.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by IN22913003 on 07-12-2019.
 */
public class BaseUtils {
    public WebDriver driver;
    @BeforeTest
    public void preCondition()
    {
        System.setProperty("webdriver.chrome.driver","C://Users//IN22913003//IdeaProjects//ThoughtWorks_Automation//src//main//resources//drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.xyzsite.com/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterTest
    public void postCondition()
    {
        driver.close();
    }
}
