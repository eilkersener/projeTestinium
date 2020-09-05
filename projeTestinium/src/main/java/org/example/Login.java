package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;
    By Email = By.id("email");
    By Password = By.id("password");
    By btnGiris = By.id("loginSubmit");
    By popup = By.cssSelector("body > div.fancybox-overlay.fancybox-overlay-fixed > div > div > a");
    By btnGirisYap = By.xpath(("//*[@id='accountBtn']"));



    public void popupClick(){

        driver.findElement(popup).click();
    }
    public void btnGirisYapClick(){
        driver.findElement(btnGirisYap).click();
    }
    public void getLogin(String emailId,String passwordValue){
        driver.findElement(Email).sendKeys(emailId);
        driver.findElement(Password).sendKeys(passwordValue);
        driver.findElement(btnGiris).click();
    }

    public Login(WebDriver driver){
        this.driver = driver;
    }

}
