package com.vtrack.test.sprint1;


import com.vtrack.useablemethods.pages.Car_Entities_Page;
import com.vtrack.useablemethods.utilities.*;
import com.vtrack.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS3 extends TestBase {

    @Test(priority = 3)
    public void test1() {
        /** navigate to vehicle */
        Car_Entities_Page.getCar_Entities_Page(Driver.getDriver());

        /** clicking on car grid */
        WebElement carGrid = Driver.getDriver().findElement(By.xpath("//tr[@class= 'grid-row row-click-action']//td"));
        carGrid.click();


        Assert.assertTrue(AddEvent.findAddedEvent(Driver.getDriver()));



    }





}
