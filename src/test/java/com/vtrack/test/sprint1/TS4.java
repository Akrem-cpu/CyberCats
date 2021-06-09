package com.vtrack.test.sprint1;


import com.vtrack.test.useablemethods.pages.MainPage;
import com.vtrack.test.useablemethods.utilities.BrowserUtils;
import com.vtrack.test.useablemethods.utilities.Locators;
import com.vtrack.test.useablemethods.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TS4 {
    WebDriver driver = WebDriverFactory.getDriver("Chrome");
    @AfterClass
    public void finish() throws InterruptedException {
        BrowserUtils.sleep(3);
        driver.close();
    }
    @Test
    public void test1(){
        Locators locators = new Locators();
        MainPage.LoginToVTrackAccount(driver);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement fleet = driver.findElement(By.xpath(locators.getFleet()));
        fleet.click();
        BrowserUtils.sleep(2);
        WebElement vehicles = driver.findElement(By.xpath(locators.getVehicles()));
        vehicles.click();



        WebElement grid = driver.findElement(By.xpath("//a[@title='Grid Settings']"));
        grid.click();


    }

    @Test
    public void test2(){

        WebElement id = driver.findElement(By.xpath("//tbody[@class='ui-sortable']//tr[1]//td[1]"));
        BrowserUtils.sleep(2);
        id.click();
        WebElement x = driver.findElement(By.xpath("//span[.='×'] "));
        x.click();
        BrowserUtils.sleep(5);
        WebElement rest = driver.findElement(By.xpath("//a[@title='Reset']"));
        rest.click();
    /*    id = driver.findElement(By.xpath("//label[@for='column-c3497']"));*/
        Assert.assertFalse(id.isSelected());
















    }
}
