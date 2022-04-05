package com.company;

import java.util.HashMap;

public class Multition {

    private static HashMap< DataBaseTypes,Multition> dbInstance=new HashMap<>();
    private String jdbcConnection;

    public String getJdbcConnection() {
        return jdbcConnection;
    }

    Multition(String jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    public static Multition getInstance(DataBaseTypes dataBaseType){
        if(dbInstance.get(dataBaseType)==null){
            /// database connection  to get User
            if(dataBaseType==DataBaseTypes.HRDB)
            dbInstance.put(dataBaseType,new Multition("HR"));
            else
                dbInstance.put(dataBaseType,new Multition("Client"));


        }

        return dbInstance.get(dataBaseType) ;
    }

}
