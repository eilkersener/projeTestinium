package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class projeTest {
    public static WebDriver driver;
    public static String baseUrl;


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\projeTestinium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.trendyol.com";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(200,TimeUnit.SECONDS);

    }
    @Test
    public void Test() throws Exception {
        driver.get(baseUrl);
        String urlEquals ="https://www.trendyol.com";
        assertEquals(baseUrl,urlEquals);
        Thread.sleep(3000);
        Login loginTest = new Login(driver);
        loginTest.popupClick();
        loginTest.btnGirisYapClick();
        Thread.sleep(5000);
        loginTest.getLogin("trendyoltest835@gmail.com","deneme123");
        ProductOperations productOperationsTest = new ProductOperations(driver);
        Thread.sleep(5000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.trendyol.com/butik/liste/erkek?e=login";
        assertEquals(expectedUrl,actualUrl);
        Thread.sleep(5000);
        productOperationsTest.sendKeyword();
        productOperationsTest.searchClick();
        productOperationsTest.RandomProduct();
        BasketPage basket = productOperationsTest.addBasket();
        Thread.sleep(3000);
        basket.basketListClick();
        Thread.sleep(3000);
        basket.productIncrease();
        basket.deleteProductClick();
        basket.deleteBtnClick();















    }

}