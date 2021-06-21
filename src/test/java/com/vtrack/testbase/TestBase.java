package com.vtrack.testbase;

import com.vtrack.test.useablemethods.utilities.BrowserUtils;
import com.vtrack.test.useablemethods.utilities.ConfigurationReader;
import com.vtrack.test.useablemethods.utilities.Driver;
import com.vtrack.test.useablemethods.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public abstract class TestBase {

  @BeforeMethod
  public void setup(){
      Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
  }
  @AfterMethod
    public void finishUp(){
    BrowserUtils.sleep(2);
      Driver.closeDriver();
  }


}
