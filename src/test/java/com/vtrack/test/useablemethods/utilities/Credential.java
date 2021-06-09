package com.vtrack.test.useablemethods.utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Credential {
    private List<String> driverUserNames ;
    private  List<String> storeMangerNames;
    private List<String> salesMangerNames;
    private String password;

    public Credential(){
        driverUserNames = new ArrayList<>(Arrays.asList("user10","user11","user12"));
        salesMangerNames = new ArrayList<>(Arrays.asList("salesmanager107" , "salesmanager108" ," salesmanager109"));
        storeMangerNames = new ArrayList<>(Arrays.asList("storemanager55" , "storemanager56"));
        password = "UserUser123";
    }

    public List<String> getDriverUserNames() {
        return driverUserNames;
    }

    public List<String> getStoreMangerNames() {
        return storeMangerNames;
    }

    public List<String> getSalesMangerNames() {
        return salesMangerNames;
    }

    public String getPassword() {
        return password;
    }

}
