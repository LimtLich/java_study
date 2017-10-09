package com.company.hello;

public class license {
    public String showLicense(String name,int age,String logo){
        String formatString = "Driver Name:%s,driver Age:%d,Car logo is:%s";
        String outputString = String.format(formatString,name,age,logo);
        return outputString;
    }
}
