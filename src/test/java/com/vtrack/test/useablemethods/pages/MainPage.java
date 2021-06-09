package com.vtrack.test.useablemethods.pages;

import com.vtrack.test.useablemethods.utilities.Credential;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class MainPage {
    public static void LoginToVTrackAccount(WebDriver driver){

        Credential credential = new Credential();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.cssSelector("input[id='prependedInput']"));
        username.sendKeys(credential.getDriverUserNames().get(1));
        WebElement password = driver.findElement(By.cssSelector("input[id='prependedInput2']"));
        password.sendKeys(credential.getPassword());
        WebElement buttonLogin = driver.findElement(By.cssSelector("button[id='_submit']"));
        buttonLogin.click();
    }
}
