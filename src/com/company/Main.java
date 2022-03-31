package com.company;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LoggedInUser user = LoggedInUser.getInstance();
         Logger LOGGER =
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        LOGGER.log(Level.INFO,user.getuserName());
        Multition userDbConn=Multition.getInstance(user.getRole()=="HR"?DataBaseTypes.HRDB:DataBaseTypes.DevDB);


    }
}
