package com.company.AbstractFactoryPattern;

public class ProcessorFactory {
    public Iprocessor getProceesorInstance(String type){
        if(type=="HighEnd"){
            return new HighEndProcessor();
        }
        else{
            return new LowEndProcessor();
        }
    }
}
