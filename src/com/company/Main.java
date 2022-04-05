package com.company;

import com.company.AbstractFactoryPattern.ComputerFactory;
import com.company.AbstractFactoryPattern.IMonitor;
import com.company.AbstractFactoryPattern.IStorge;
import com.company.AbstractFactoryPattern.Iprocessor;
import com.company.Factorypattern.Transport;
import com.company.Factorypattern.TransportFactory;
import com.company.PrototypePattern.Employee;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        LoggedInUser user = LoggedInUser.getInstance();
         Logger LOGGER =
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        LOGGER.log(Level.INFO,user.getuserName());
        //singleton
        // getting instance of Logged in user
        LoggedInUser loggedInUser= LoggedInUser.getInstance();


        // Multiton
        // getting HRDB database instance
        Multition userDbConn= Multition.getInstance(DataBaseTypes.HRDB);
        userDbConn.getJdbcConnection();




        // static Factory Pattern  with Numberformat

        double d = 123456.789;

        NumberFormat nf
                = NumberFormat.getInstance(Locale.ITALY);
        System.out.println("ITALY representation of " + d
                + " : " + nf.format(d));
         nf= NumberFormat.getInstance(Locale.CANADA);
        System.out.println("CANADA representation of " + d
                + " : " + nf.format(d));
        nf= NumberFormat.getInstance(Locale.CHINESE);
        System.out.println("CHINESE representation of " + d
                + " : " + nf.format(d));
        nf= NumberFormat.getInstance(Locale.SIMPLIFIED_CHINESE);
        System.out.println(" Simplified CHINESE representation of " + d
                + " : " + nf.format(d));

        //FactoryPattern
        // Accessing Transport Factory to get instance for Roadways
        TransportFactory transportFactory=new TransportFactory();

        Transport roadWays = transportFactory.getInstance("roadWays");

        //Abstract Pattern
        ComputerFactory computerFactory = new ComputerFactory();
        IMonitor monitor=computerFactory.getMonitorInstance("LCD");
        Iprocessor processor=computerFactory.getProcessorInstance("HighEnd");
        IStorge storage = computerFactory.getStoregeInstance("HDD");





        //Prototype Pattern
        Employee emp=new Employee();
        emp.loadData();
        System.out.println(emp.getEmpList());

        Employee emp2 = emp.clone();
        System.out.println(emp2.getEmpList());


    }
}
