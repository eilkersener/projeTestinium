package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage {
    WebDriver driver;
    By BasketListBtn = By.id("myBasketListItem");
    By ProductAdd = By.xpath("//*[@id=\'partial-basket\']/div/div[2]/div[2]/div[3]/div[1]/div/button[2]");
    By DeleteProduct = By.xpath("//*[@id=\"partial-basket\"]/div/div[2]/div[2]/div[3]/button");
    By DeleteBtn = By.xpath("//*[@id=\'ngdialog1\']/div[2]/form/div/div[2]/div/div[1]/button[2]");
    By EmptyTxt = By.xpath("//*[@id=\'basketNoProductPage\']/div[2]/div/div[1]");


    public void basketListClick(){
        driver.findElement(BasketListBtn).click();
    }
    public void productIncrease(){
        driver.findElement(ProductAdd).click();
    }
    public void deleteProductClick(){
        driver.findElement(DeleteProduct).click();
    }
    public void deleteBtnClick(){
        driver.findElement(DeleteBtn).click();
    }

    public BasketPage(WebDriver driver){
        this.driver = driver;

    }

}
