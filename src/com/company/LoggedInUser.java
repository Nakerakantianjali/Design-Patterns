package com.company;

public class LoggedInUser {
    private String name;
    private static LoggedInUser userObj;
    private String getName() {
        return name;
    }

    private String role;

    public String getRole() {
        return role;
    }



    private LoggedInUser() {
    }

    private LoggedInUser(String name,String role) {
        this.name = name;
        this.role=role;
    }
    public static LoggedInUser getInstance(){
        if(userObj==null){
            /// database connection  to get User
            userObj=new LoggedInUser("Anjali","HR");
        }
        return userObj;
    }
    public String getuserName(){
        return name;
    }



}
