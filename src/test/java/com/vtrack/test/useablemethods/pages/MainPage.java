package com.vtrack.test.useablemethods.pages;

import com.github.javafaker.File;
import com.vtrack.test.useablemethods.utilities.ConfigurationReader;
import com.vtrack.test.useablemethods.utilities.Credential;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class MainPage {
    public static void LoginToAVTrackDriverAccount(WebDriver driver) throws IOException {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getProperty("env1"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.cssSelector("input[id='prependedInput']"));
        username.sendKeys(ConfigurationReader.getProperty("usernamefordriver"));
        WebElement password = driver.findElement(By.cssSelector("input[id='prependedInput2']"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        WebElement buttonLogin = driver.findElement(By.cssSelector("button[id='_submit']"));
        buttonLogin.click();
    }



}
