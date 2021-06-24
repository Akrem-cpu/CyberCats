package com.vtrack.useablemethods.pages;

import com.vtrack.useablemethods.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {


    public static void LoginToAVTrackDriverAccount(WebDriver driver,String keyword)  {
        WebElement username = driver.findElement(By.cssSelector("input[id='prependedInput']"));
        username.sendKeys(ConfigurationReader.getProperty(keyword));
        WebElement password = driver.findElement(By.cssSelector("input[id='prependedInput2']"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        WebElement buttonLogin = driver.findElement(By.cssSelector("button[id='_submit']"));
        buttonLogin.click();
    }



}
