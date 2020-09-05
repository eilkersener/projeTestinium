package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductOperations {
    WebDriver driver;

    By searchBox = By.xpath("//*[@id=\'auto-complete-app\']/div/div/input");
    By txtClick = By.cssSelector("#auto-complete-app > div > div.suggestions-container > div > a:nth-child(2)");


     public void sendKeyword(){
        driver.findElement(searchBox).sendKeys("bilgisayar");
    }
    public void searchClick(){
        driver.findElement(txtClick).click();
    }
    public void RandomProduct(){
        Random rnd = new Random();
        int index = rnd.nextInt(20)+1;
        List<WebElement> links = driver.findElements(By.className("p-card-img"));
        links.get(index).click();
    }
    public BasketPage addBasket(){
        driver.findElement(By.className("add-to-bs-tx")).click();
        BasketPage basket = new BasketPage(driver);
        return basket;

    }



    public ProductOperations(WebDriver driver){
        this.driver = driver;

    }


}
