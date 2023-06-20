package org.example;

/*
code is developed by Abhishek
*/
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionClass {
    private static final Logger logger = LogManager.getLogger("Abhishek");

    public static Connection getConnection(){
        Connection connection = null;
        //here we will use try with catch block throw for exception
        try{
            //Load the driver
            FileInputStream propertyFile = new FileInputStream("src/main/java/org/example/config.properties");
            Properties properties = new Properties();
            properties.load(propertyFile);

            Class.forName(properties.getProperty("driverLink"));

            //Establishing Connection
            connection = DriverManager.getConnection(properties.getProperty("connectionLink"),properties.getProperty("username"),properties.getProperty("password"));
              logger.info(connection);
        }
        catch (ClassNotFoundException classNotFoundException){
            classNotFoundException.getException();
        }
        catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }
        catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        return connection;

    }

}
