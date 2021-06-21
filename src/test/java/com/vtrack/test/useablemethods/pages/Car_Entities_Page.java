package com.vtrack.test.useablemethods.pages;

import com.vtrack.test.useablemethods.utilities.BrowserUtils;
import com.vtrack.test.useablemethods.utilities.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Car_Entities_Page {

     public static void getCar_Entities_Page(WebDriver driver) {
         MainPage.LoginToAVTrackDriverAccount(driver,"usernamefordriver");
         BrowserUtils.sleep(2);
         WebElement fleet = driver.findElement(By.xpath(Locators.FLEET));
         fleet.click();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         WebElement vehicles = driver.findElement(By.xpath(Locators.VEHICLES));
         vehicles.click();


     }







}
