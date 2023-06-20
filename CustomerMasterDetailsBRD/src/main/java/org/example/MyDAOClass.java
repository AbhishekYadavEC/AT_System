package org.example;
/*
code is developed by Abhishek
*/
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//we will implement of DAO Class with DAO interface
public class MyDAOClass implements MyDAOInterface {
    private static final Logger logger = LogManager.getLogger("Abhishek");

    Connection connection = ConnectionClass.getConnection();

    @Override
    public String fileLocation() {
        String query = "Select * from system_parameter_06";
        String location = "";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                location = location.concat(resultSet.getString(1) + resultSet.getString(2) + "~");
            }
        } catch (SQLException sqlException) {
            logger.info(sqlException);
        }

        return location;
    }

    @Override
    public void insertCustomer(ArrayList<Customer> customers) {
        try {
            for (Customer customer : customers) {
                //here we will insert data in datdbase form the inputFile
                String query = "insert into CustomerMaster_AY_16915 (Customer_Code, Customer_name, Customer_Address_1, Customer_Address_2, Customer_PinCode, Email_Address, Contact_Number, Primary_Contact_Person, Record_Status, Flag, Created_Date, Created_By, Modified_Date, Modified_By, Authorized_Date, Authorized_By) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                //here we will set the details of customer
                preparedStatement.setString(1, customer.getCustomerCode());
                preparedStatement.setString(2, customer.getCustomerName());
                preparedStatement.setString(3, customer.getCustomerAddress1());
                preparedStatement.setString(4, customer.getCustomerAddress2());
                preparedStatement.setInt(5, customer.getPinCode());
                preparedStatement.setString(6, customer.getEmailAddress());
                preparedStatement.setLong(7, customer.getContactNumber());
                preparedStatement.setString(8, customer.getPrimaryContactPerson());
                preparedStatement.setString(9, customer.getRecordStatus());
                preparedStatement.setString(10, customer.getFlag());
                preparedStatement.setString(11, customer.getCreateDate());
                preparedStatement.setString(12, customer.getCreatedBy());
                preparedStatement.setString(13, customer.getModifiedDate());
                preparedStatement.setString(14, customer.getModifiedBy());
                preparedStatement.setString(15, customer.getAuthorizedDate());
                preparedStatement.setString(16, customer.getAuthorizedBy());

                preparedStatement.executeUpdate();

            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}