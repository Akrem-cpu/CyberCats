package com.vtrack.test.sprint1;


import com.vtrack.test.useablemethods.pages.Car_Entities_Page;
import com.vtrack.test.useablemethods.pages.MainPage;
import com.vtrack.test.useablemethods.utilities.BrowserUtils;
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

public class TS4 extends TestBase {

    @Test(priority = 4)
    public void test1()  {
        Car_Entities_Page.getCar_Entities_Page(Driver.getDriver());
        BrowserUtils.sleep(5);
        WebElement grid = Driver.getDriver().findElement(By.xpath(Locators.GRID));
        grid.click();
        WebElement id = Driver.getDriver().findElement(By.xpath("//tbody[@class='ui-sortable']//tr[1]//td[1]"));
        BrowserUtils.sleep(2);
        id.click();
        WebElement x = Driver.getDriver().findElement(By.xpath("//span[.='×']"));
        x.click();
        BrowserUtils.sleep(5);
        WebElement rest = Driver.getDriver().findElement(By.xpath("//a[@title='Reset']"));
        rest.click();
        Assert.assertFalse(id.isSelected());



    }

}
