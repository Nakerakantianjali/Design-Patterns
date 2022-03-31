package com.company.AbstractFactoryPattern;

public class ComputerFactory implements IComputer{



    @Override
    public Iprocessor getProcessorInstance(String type) {
        return   new ProcessorFactory().getProceesorInstance(type);
    }

    @Override
    public IStorge getStoregeInstance(String type) {
        return new StorageFatory().getStorageInstance(type);
    }

    @Override
    public IMonitor getMonitorInstance(String type) {
        return new MonitorFactory().getMonitorInstance(type);

    }
}
