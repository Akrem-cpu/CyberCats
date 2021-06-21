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

public class TS2 extends TestBase {



    @Test(priority = 2)
    public void test1() {
        /** navigate to vehicle */
        Car_Entities_Page.getCar_Entities_Page(Driver.getDriver());
        /** clicking on car grid */
        WebElement carGrid = Driver.getDriver().findElement(By.xpath("//tr[@class= 'grid-row row-click-action']//td"));
        carGrid.click();
        /** checking header */
        WebElement text = Driver.getDriver().findElement(By.xpath("//span[.='General Information']"));
        String actualText = text.getText();
        String expectedText = "General Information";
        Assert.assertEquals(actualText,expectedText);

    }






}
