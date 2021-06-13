package com.vtrack.test.sprint1;


import com.vtrack.test.useablemethods.pages.Car_Entities_Page;
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

        /** navigate to vehicle */
        Car_Entities_Page.getCar_Entities_Page(driver);
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
