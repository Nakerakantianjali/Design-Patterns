package com.company.AbstractFactoryPattern;

public class StorageFatory {
    public IStorge getStorageInstance(String type){
        if(type=="HDD"){
            return new HDDStorage();
        }
        else{
            return new SSDStorage();
        }
    }
}
