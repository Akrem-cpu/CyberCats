package com.vtrack.test.sprint1;


import com.vtrack.useablemethods.pages.Car_Entities_Page;
import com.vtrack.useablemethods.utilities.BrowserUtils;
import com.vtrack.useablemethods.utilities.Driver;
import com.vtrack.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS1 extends TestBase {



    @Test
    public void test1() {
        /** navigate to vehicle */
        Car_Entities_Page.getCar_Entities_Page(Driver.getDriver());
        /** checking the title Vs expected */
        BrowserUtils.sleep(5);
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle ="Car - Entities - System";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }


















}
