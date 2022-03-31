package com.company.AbstractFactoryPattern;

public class HDDStorage implements IStorge{
    @Override
    public void storeData() {
        System.out.println("Hdd Storage");
    }
}
