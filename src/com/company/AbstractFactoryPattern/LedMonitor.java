package com.company.AbstractFactoryPattern;

public class LedMonitor implements IMonitor {
    @Override
    public void screenSize() {
        System.out.println("LED Screen Size");
    }

}
