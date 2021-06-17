package com.vtrack.testbase;

import com.vtrack.test.useablemethods.utilities.ConfigurationReader;
import com.vtrack.test.useablemethods.utilities.Driver;
import com.vtrack.test.useablemethods.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestBase {

  @BeforeMethod
  public void setup(){
      Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
  }
  @AfterMethod
    public void finishUp(){
      Driver.getDriver().close();
  }


}
