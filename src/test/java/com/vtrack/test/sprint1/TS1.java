package com.vtrack.test.sprint1;


import com.vtrack.test.useablemethods.pages.Car_Entities_Page;
import com.vtrack.test.useablemethods.pages.MainPage;
import com.vtrack.test.useablemethods.utilities.Driver;
import com.vtrack.test.useablemethods.utilities.Locators;
import com.vtrack.test.useablemethods.utilities.WebDriverFactory;
import com.vtrack.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TS1 extends TestBase {



    @Test
    public void test1() throws InterruptedException, IOException {

        MainPage.LoginToAVTrackDriverAccount(Driver.getDriver());
        /** navigate to vehicle */
        Car_Entities_Page.getCar_Entities_Page(Driver.getDriver());
        /** checking the title Vs expected */
        Thread.sleep(500);
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle ="Car - Entities - System";
        Assert.assertTrue(actualTitle.contains(expectedTitle));



   }


















}
