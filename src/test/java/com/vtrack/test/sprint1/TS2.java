package com.vtrack.test.sprint1;


import com.vtrack.test.useablemethods.pages.MainPage;
import com.vtrack.test.useablemethods.utilities.Locators;
import com.vtrack.test.useablemethods.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TS2 {
    WebDriver driver = WebDriverFactory.getDriver("Chrome");

    @AfterClass
    public void finish() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }


    @Test
    public void test1() throws InterruptedException, IOException {
        MainPage.LoginToAVTrackDriverAccount(driver);
        Locators locators = new Locators();
        /** navigate to vehicle */
        WebElement fleet = driver.findElement(By.xpath(locators.getFleet()));
        fleet.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement vehicles = driver.findElement(By.xpath(locators.getVehicles()));
        vehicles.click();



    }

    @Test
    public void test2(){

        /** clicking on car grid */
        WebElement carGrid = driver.findElement(By.xpath("//tr[@class= 'grid-row row-click-action']//td"));
        carGrid.click();


        /** checking header */
        WebElement text = driver.findElement(By.xpath("//span[.='General Information']"));
        String actualText = text.getText();
        String expectedText = "General Information";
        Assert.assertEquals(actualText,expectedText);

    }




}
