package com.vtrack.test.sprint0.negative_ts1_to_ts5;


import com.vtrack.test.useablemethods.pages.MainPage;
import com.vtrack.test.useablemethods.utilities.ConfigurationReader;
import com.vtrack.test.useablemethods.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TS1_01 {

    WebDriver driver;
    @AfterClass
    public void finishSetUp(){
       driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.close();

    }

    @BeforeClass
    public void setUp() throws IOException {
        Properties properties= new Properties();
        properties.load(new FileInputStream("configuration.properties"));
        driver =   WebDriverFactory.getDriver(properties.getProperty("browser"));
        driver.get("https://qa3.vytrack.com/");
    }

    // Step 1 - Go to Vytrack login page
    @Test
    public void test1() {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Login";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    // Step 2 - Enter incorrect username for user
    @Test
    public void test2() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.cssSelector("input[id='prependedInput']"));
        username.sendKeys("Incorrect user name");

    }

    // Step 3 - Enter correct password for user
    @Test
    public void test3() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement password = driver.findElement(By.cssSelector("input[id='prependedInput2']"));
        password.sendKeys("UserUser123");

    }

    //Step 4 - Click login button
    @Test
    public void test4() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement buttonLogin = driver.findElement(By.cssSelector("button[id='_submit']"));
        buttonLogin.click();

    }
    //Step 5 - User should see the message “Invalid username or password”
    @Test
    public void test5(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='alert alert-error']"));
        Assert.assertTrue(errorMessage.isDisplayed());


    }



}
