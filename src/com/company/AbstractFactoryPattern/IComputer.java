package com.company.AbstractFactoryPattern;

public interface IComputer {
    Iprocessor getProcessorInstance(String type);
    IStorge getStoregeInstance(String type);
    IMonitor getMonitorInstance(String type);
}
