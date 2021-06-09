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

public class TS3 {
    WebDriver driver = WebDriverFactory.getDriver("Chrome");
    @AfterClass
    public void finish() throws InterruptedException {
         BrowserUtils.sleep(3);
        driver.close();
    }



    @Test
    public void test1() throws InterruptedException {
        MainPage.LoginToVTrackAccount(driver);
        Locators locators = new Locators();

        /** navigate to vehicle */
        WebElement fleet = driver.findElement(By.xpath(locators.getFleet()));
        fleet.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement vehicles = driver.findElement(By.xpath(locators.getVehicles()));
        vehicles.click();

        /** clicking on car grid */
        WebElement carGrid = driver.findElement(By.xpath("//tr[@class= 'grid-row row-click-action']//td"));
        carGrid.click();



    }

    @Test
    public void test2() throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    String keysToSend= "CyberCats";
     WebElement addEvent = driver.findElement(By.xpath("//i[.='Add Event']/.."));
     addEvent.click();
     BrowserUtils.sleep(5);
     WebElement title = driver.findElement(By.xpath("//input[contains(@id,'oro_calendar_event_form_title-uid')]"));
     title.sendKeys(keysToSend);

    }


    @Test
    public void test3(){
        String keysToSend= "CyberCats";

        BrowserUtils.sleep(2);
        WebElement organizerDisplayName = driver.findElement(By.xpath("//input[contains(@id,'oro_calendar_event_form_organizerDisplayName-uid')]"));
        organizerDisplayName.sendKeys(keysToSend);
        BrowserUtils.sleep(2);
        WebElement organizerEmail = driver.findElement(By.xpath("//input[contains(@id,'oro_calendar_event_form_organizerEmail-uid-')]"));
        organizerEmail.sendKeys("CyberCats@gmail.com");
        BrowserUtils.sleep(2);
        WebElement save = driver.findElement(By.xpath("//button[.='Save']"));
        save.click();
        WebElement activity = driver.findElement(By.xpath("//a[.='Activity']"));
        activity.click();
        BrowserUtils.sleep(3);
        WebElement myEvent = driver.findElement(By.xpath("//strong[.='CyberCats']"));

        String actualEventText = myEvent.getText();


        Assert.assertEquals(keysToSend,actualEventText);

    }



}
