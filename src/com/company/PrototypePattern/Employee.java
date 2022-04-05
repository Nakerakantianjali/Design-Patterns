package com.company.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee{
    private List<String> empList;

    public Employee(){
        empList = new ArrayList<String>();
    }

    public Employee(List<String> list){
        this.empList=list;
    }
    public void loadData(){
        System.out.println("load Data");
        //read all employees from database and put into the list
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException{

        List<String> temp = new ArrayList<String>();
        for(String s : this.getEmpList()){
            temp.add(s);
        }
        return new Employee(temp);
    }


}
