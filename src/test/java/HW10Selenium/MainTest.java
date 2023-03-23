package HW10Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.*;

public class MainTest {

    public static WebDriver driver;

    @BeforeTest
            public static  void setup(){
        System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }


    @Test(priority = 1)
    public void findAuto() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        driver.get(mainPage.getMainPageAddress());
        WebElement markaAuto = driver.findElement(By.xpath("//button[@name='p-6-0-2-brand']"));
        markaAuto.click();
        WebElement searchMarkaAuto = driver.findElement(By.xpath("//input[@placeholder='Поиск']"));
        searchMarkaAuto.sendKeys("Audi" + Keys.ENTER);
        Thread.sleep(3000);
        WebElement model = driver.findElement(By.xpath("//button[@name='p-6-0-3-model']"));
        model.click();
        //Thread.sleep(3000);
        //WebElement searchModel = mainPage.driver.findElement(By.xpath("//button[@data-item-label='80']"));
        WebElement searchModel = new WebDriverWait(driver, Duration.ofSeconds(120))
               .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-item-label='80']")));
        searchModel.click();
        Thread.sleep(3000);

        WebElement buttonShow = driver.findElement(By.xpath("//a[@class='button button--secondary button--block']"));
        buttonShow.click();
        Thread.sleep(5000);
        //Купить Audi 80 | 310 объявлений о продаже на av.by | Цены, характеристики, фото.
        String[] title = driver.getTitle().split(" ");
        String actual = title[1] + " " + title[2];
        Assert.assertEquals(actual, "Audi 80");
    }
    @Test(priority = 0)
    public void testTitle(){
        MainPage mainPage = new MainPage(driver);
        mainPage.driver.get(mainPage.getMainPageAddress());
        String title = mainPage.driver.getTitle();
        Assert.assertEquals(title, mainPage.getGetMainPageTitile());
        mainPage.driver.quit();
    }
    @AfterClass
    public void endTest(){
        driver.quit();
    }
}