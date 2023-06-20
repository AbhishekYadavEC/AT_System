package org.example;
/*
code is developed by Abhishek
*/
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class FinalLinked {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger("Abhishek");
        /* create object of DAOClass and it will give the file location of Dao Class */
        MyDAOClass daoImplement = new MyDAOClass();
        String string = daoImplement.fileLocation();
        String[] temp = string.split("~");

        try{
            for(String str : temp){
                ArrayList<Customer> customers = CustomerMaster.getCustomerArrayList(str);
                daoImplement.insertCustomer(customers);
            }
        }
        catch (Exception exception){
            logger.info(exception);
        }
    }
}
