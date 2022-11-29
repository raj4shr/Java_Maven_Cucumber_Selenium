package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.time.Duration;

public class MainBaseClass {

    public static  WebDriver chromeDriver;

    public void SetUp()
    {
        System.setProperty("chrome web driver",System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        ChromeOptions cOptions=new ChromeOptions();
        cOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeDriver= new ChromeDriver(cOptions);
        chromeDriver.get("http://horse.industryconnect.io/Account/Login?ReturnUrl=%2f");
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void TearDown()
    {
//        chromeDriver.close();
        chromeDriver.quit();
    }

    public void loginToPortal()
    {
        chromeDriver.findElement(By.id("UserName")).sendKeys("hari");
        chromeDriver.findElement(By.id("Password")).sendKeys("123123");
        chromeDriver.findElement(By.xpath("//input[@type='submit'][@value='Log in']")).click();
    }

}
