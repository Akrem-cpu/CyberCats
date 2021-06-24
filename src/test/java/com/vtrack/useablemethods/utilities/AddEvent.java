package com.vtrack.useablemethods.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEvent {

    public static void addEvent(WebDriver driver){
        String keysToSend= "CyberCats";
        WebElement addEvent = driver.findElement(By.xpath("//i[.='Add Event']/.."));
        addEvent.click();
        BrowserUtils.sleep(5);
        WebElement title = driver.findElement(By.xpath("//input[contains(@id,'oro_calendar_event_form_title-uid')]"));
        title.sendKeys(keysToSend);
        BrowserUtils.sleep(2);
        WebElement organizerDisplayName = driver.findElement(By.xpath("//input[contains(@id,'oro_calendar_event_form_organizerDisplayName-uid')]"));
        organizerDisplayName.sendKeys(keysToSend);
        BrowserUtils.sleep(2);
        WebElement organizerEmail = driver.findElement(By.xpath("//input[contains(@id,'oro_calendar_event_form_organizerEmail-uid-')]"));
        organizerEmail.sendKeys("CyberCats@gmail.com");
        BrowserUtils.sleep(2);
        WebElement save = driver.findElement(By.xpath("//button[.='Save']"));
        save.click();

    }
    public static boolean findAddedEvent(WebDriver driver){
        String keysToSend= "CyberCats";

        WebElement activity = Driver.getDriver().findElement(By.xpath("//a[.='Activity']"));
        activity.click();
        BrowserUtils.sleep(3);
        WebElement myEvent = Driver.getDriver().findElement(By.xpath("//strong[.='CyberCats']"));

        String actualEventText = myEvent.getText();


       if (keysToSend.equals(actualEventText)){
           return true;
       }else {
           return false;
       }



    }



}
