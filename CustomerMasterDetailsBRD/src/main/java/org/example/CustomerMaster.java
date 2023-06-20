package org.example;
/*
code is developed by Abhishek
*/
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Properties;

public class CustomerMaster {
    private static final Logger logger = LogManager.getLogger("Abhishek");
    static String duplicateCheck = "";

    static Connection connection = ConnectionClass.getConnection();

    public static ArrayList<Customer> getCustomerArrayList(String location){
        ArrayList<Customer> customerArrayList = new ArrayList<>();

        //FileInputStream class reads data from a properties file.
        try(FileInputStream propertyFile = new FileInputStream("src/main/java/org/example/config.properties"))
        {
            logger.info("Connection is Established");

            //Properties class used to store and retrieve string type data from the properties file.
            Properties properties = new Properties();
            properties.load(propertyFile);

            //File class is Java’s representation of a file or directory pathname.
            File file = new File(location);

            if(!file.exists()){
                logger.info("File does not exist");
                return null;
            }

            //string split() method breaks a given string around matches of the given regular expression. After splitting, returns string Array.
            String[] rejection = location.split("\\\\");

            //Checking here file have .txt extension or not.
            if(!location.endsWith(".txt")){
                logger.info("Here File is Invalid");
                String query = "update System_Parameter_06 set Rejection_Level = 'F' where File_Name = '" + rejection[rejection.length-1]+ "'";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.execute();
                return null;
            }

            //BufferedReader reads text from a character-input stream, buffering characters as to provide for the efficient reading of characters, arrays, and lines.
            BufferedReader bufferedReader = new BufferedReader(new FileReader(location));

            FileWriter fileWriter = new FileWriter(properties.getProperty("reject"));

            String line = null;

            while((line = bufferedReader.readLine()) != null){

                while(line.contains("~~")){
                    line = line.replaceAll("~~", "~null~");
                }

                if(line.endsWith("~")){
                    line = line.concat("null");
                }

                String data[] = line.split("~");

                if(!Validation.customerCodeValidation(data[0]) || duplicateCheck.contains(data[0])){
                    logger.info("Here Customer code is invalid, CustomerCode is: "+data[0]);
                    String query = "update System_Parameter_06 set Rejection_Level = 'R' where File_Name = '" + rejection[rejection.length-1]+ "'";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.execute();
                    fileWriter.write(line + "\n");
                    continue;
                }

                //here we will check validation of customer name
                if(!Validation.customerNameValidation(data[1])){
                    logger.info("Here if Customer name is invalid, CustomerCode is: "+data[0]);
                    fileWriter.write(line + "\n");
                    continue;
                }

                //Here we will check validation of address1 Validation
                if(!Validation.address1Validation(data[2])){
                    logger.info("Here if Customer address1 is invalid, CustomerCode is: "+data[0]);
                    fileWriter.write(line + "\n");
                    continue;
                }
                //Here we will check validation of pin code
                if(!Validation.pinCodeValidation(data[4])){
                    logger.info("Here if Customer pinCode is invalid, CustomerCode is: "+data[0]);
                    fileWriter.write(line + "\n");
                    continue;
                }
                //here we will check validation of emailID
                if(!Validation.emailValidation(data[5])){
                    logger.info("Here if Customer email is invalid, CustomerCode is: "+data[0]);
                    fileWriter.write(line + "\n");
                    continue;
                }

                if(!Validation.contactPersonValidation(data[7])){
                    logger.info("Here if Customer contactPerson is invalid, CustomerCode is: "+data[0]);
                    fileWriter.write(line + "\n");
                    continue;
                }

                if(!Validation.recordStatusValidation(data[8])){
                    logger.info("Here if Customer recordStatus is invalid, CustomerCode is: "+data[0]);
                    fileWriter.write(line + "\n");
                    continue;
                }

                if(!Validation.flagValidation(data[9])){
                    logger.info("Here if Customer flag is invalid, CustomerCode is: "+data[0]);
                    fileWriter.write(line + "\n");
                    continue;
                }

                if(!Validation.createdDateValidation(data[10])){
                    logger.info("Here if Customer createdDate is invalid, CustomerCode is: "+data[0]);
                    fileWriter.write(line + "\n");
                    continue;
                }

                if(!Validation.createdByValidation(data[11])){
                    logger.info("Here if Customer createdBy is invalid, CustomerCode is: "+data[0]);
                    fileWriter.write(line + "\n");
                    continue;
                }

                duplicateCheck = duplicateCheck.concat(data[0]);

                Customer customer = new Customer(data[0], data[1], data[2], Integer.valueOf(data[4]), data[5], data[7], data[8], data[9], data[10], data[11]);

                if(data[3].equals("null")){
                    customer.setCustomerAddress2(null);
                }
                else {
                    customer.setCustomerAddress2(data[3]);
                }

                if(data[6].equals("null")){
                    customer.setContactNumber(Long.valueOf(null));
                }
                else {
                    customer.setContactNumber(Long.valueOf(data[6]));
                }

                if(data[12].equals("null")){
                    customer.setModifiedDate(null);
                }
                else {
                    customer.setModifiedDate(data[12]);
                }

                if(data[13].equals("null")){
                    customer.setModifiedBy(null);
                }
                else {
                    customer.setModifiedBy(data[13]);
                }

                if(data[14].equals("null")){
                    customer.setAuthorizedDate(null);
                }
                else {
                    customer.setAuthorizedDate(data[14]);
                }

                if(data[15].equals("null")){
                    customer.setAuthorizedBy(null);
                }
                else {
                    customer.setAuthorizedBy(data[15]);
                }

                customerArrayList.add(customer);

            }
            fileWriter.close();
        }
        catch(EOFException eof)
        {
            logger.info("all objects have been read!!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return customerArrayList;
    }
}
