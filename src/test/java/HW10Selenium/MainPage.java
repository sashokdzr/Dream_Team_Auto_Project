package HW10Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

class MainPage{
    public String getMainPageAddress() {
        return mainPageAddress;
    }

    public String getGetMainPageTitile() {
        return getMainPageTitile;
    }


    private String mainPageAddress = "https://av.by";
    private String getMainPageTitile = "av.by — купить, продать авто в Беларуси. Автомобили новые и с пробегом на Автомалиновке.";

    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

}
