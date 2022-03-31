package com.company.AbstractFactoryPattern;

public class MonitorFactory {
    public IMonitor getMonitorInstance(String type){
        if(type=="LCD"){
            return new LCDMonitor();
        }
        else{
            return new LedMonitor();
        }
    }
}
