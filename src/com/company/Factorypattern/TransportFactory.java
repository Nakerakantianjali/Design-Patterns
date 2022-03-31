package com.company.Factorypattern;

public class TransportFactory  {

    public Transport getInstance(String type) throws Exception{
        if(type=="roadWays"){
            return new RoadWays();
        }
        else if (type=="waterWays"){
            return new WaterWays();
        }
        else{
             throw new Exception(" given type does not exists");
        }
    }
}
