package com.company.Factorypattern;

import jdk.nashorn.internal.runtime.options.LoggingOption;

import java.util.logging.Logger;

public class RoadWays implements Transport{
    @Override
    public void devilery() {
        System.out.println("delivered byTruck");
    }
}
