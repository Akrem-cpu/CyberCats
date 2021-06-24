package com.vtrack.pagesmodelobject;


import com.vtrack.useablemethods.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Car_Entities_page {


    public Car_Entities_page(){
        PageFactory.initElements(Driver.getDriver() , this);
    }

    /** Export Grid dropdown under Cars header **/
    @FindBy(xpath = "//div[@class='extra-actions-panel']")
    public WebElement exportGrid;


    /** CSV under export grid dropdown */
    @FindBy(xpath = "//a[@title='CSV']")
    public WebElement CSVUnderExportGridDropDown;

    /** XLSX under export grid dropdown */
    @FindBy(xpath = "//a[@title='XLSX']")
    public  WebElement XLSXUnderExportGridDropDow;







}
