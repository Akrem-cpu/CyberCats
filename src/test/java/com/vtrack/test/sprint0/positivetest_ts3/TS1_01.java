package com.vtrack.test.sprint0.positivetest_ts3;


import com.vtrack.test.useablemethods.pages.MainPage;
import com.vtrack.test.useablemethods.utilities.Driver;
import com.vtrack.test.useablemethods.utilities.WebDriverFactory;
import com.vtrack.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TS1_01 extends TestBase {

    @Test
    public void test1() {
        String expectedTitle = "Login";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        MainPage.LoginToAVTrackDriverAccount(Driver.getDriver(),"usernameforsalesmannager");
        WebElement userFirstNameAndLastName = Driver.getDriver().findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
        String userName = userFirstNameAndLastName.getAttribute("class");
        System.out.println(userName);
        Assert.assertFalse(userName.isEmpty());
    }

}
