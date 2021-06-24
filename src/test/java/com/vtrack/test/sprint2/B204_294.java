package com.vtrack.test.sprint2;

import com.vtrack.pagesmodelobject.Car_Entities_page;
import com.vtrack.testbase.TestBase;
import com.vtrack.useablemethods.pages.Car_Entities_Page;
import com.vtrack.useablemethods.utilities.BrowserUtils;
import com.vtrack.useablemethods.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B204_294 extends TestBase {

    @Test
    public void B204_295_export_grid_dropdown_test(){
        /**
         * User navigate to car entities page
         */
        Car_Entities_Page.getCar_Entities_Page(Driver.getDriver());
        Car_Entities_page carPage = new Car_Entities_page();

        // making sure the page expected title and actual title match
        BrowserUtils.sleep(2);
        String actualTitle =  Driver.getDriver().getTitle();
        String expectedTitle = "Car - Entities - System";
        Assert.assertTrue(actualTitle.contains(expectedTitle), actualTitle);

        // user should be able to see.
        //CSV
        //XLSX

       carPage.exportGrid.click();

       String actualCVSText = "CSV";
       String expectedCVSText = carPage.CSVUnderExportGridDropDown.getText();
       Assert.assertEquals(actualCVSText,expectedCVSText);
        System.out.println(actualCVSText+"check thos out");

       String actualXLSXText = carPage.XLSXUnderExportGridDropDow.getText();
       String expectedXLSXText = "XLSX";
       Assert.assertEquals(actualXLSXText,expectedXLSXText);







    }

}
