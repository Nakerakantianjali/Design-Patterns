package com.company.AbstractFactoryPattern;

public class LCDMonitor implements IMonitor{
    @Override
    public void screenSize() {
        System.out.println("LCD Monotor");
    }
}
