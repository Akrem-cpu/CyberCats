package com.vtrack.testbase;

import com.vtrack.useablemethods.utilities.BrowserUtils;
import com.vtrack.useablemethods.utilities.ConfigurationReader;
import com.vtrack.useablemethods.utilities.Driver;
import org.testng.annotations.*;

public abstract class TestBase {

  //I am creating merge request
  @BeforeMethod
  public void setup(){
      Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
  }
  @AfterMethod
    public void finishUp(){
    BrowserUtils.sleep(2);
      Driver.closeDriver();

  }
  // hello Wakshum


}
