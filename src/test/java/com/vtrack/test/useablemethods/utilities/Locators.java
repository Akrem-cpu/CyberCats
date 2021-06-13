package com.vtrack.test.useablemethods.utilities;

public class Locators {
   public static String fleet = "//span[@class='title title-level-1'][1]";
   public static   String vehicles = "//span[.='Vehicles']";
    public String getFleet() {
        return fleet;
    }

    public String getVehicles() {
        return vehicles;
    }




}
