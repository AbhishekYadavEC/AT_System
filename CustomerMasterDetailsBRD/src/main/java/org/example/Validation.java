package org.example;
/*
code is developed by Abhishek
*/
public class Validation {
    // here we will check CustomerName of Validation
    public static boolean customerNameValidation(String customerName) {
        if (customerName.equals("null") || customerName.length() > 30) {
            return false;
        }
        String regex = "^[a-z A-Z 0-9]+$";
        return customerName.matches(regex);
    }

    //Here we will check Customer Code Validation
    public static boolean customerCodeValidation(String customerCode){
        if(customerCode.equals("null") || customerCode.length() > 10){
            return false;
        }
        return true;
    }

    //Here we will check Customer Address 1 validation
    public static boolean address1Validation(String address1){
        if(address1.equals("null") || address1.length() > 100){
            return false;
        }
        return true;
    }

    //Here we will check Email Validation
    public static boolean emailValidation(String email) {
        if (email.contains(" ") || email.equals("null") || email.length() - 1 > 100) {
            return false;
        }
        else if (email.contains("@") && email.contains(".")) {
            int atIndex = email.indexOf("@");
            int dotIndex = email.lastIndexOf(".");
            return (atIndex < dotIndex && dotIndex < email.length() - 1);
        }
        return false;
    }

    //Here we will check PinCode Validation
    public static boolean pinCodeValidation(String pinCode) {
        if (pinCode.equals("null")) {
            return false;
        }
        String regex = "\\d{6}";// (\\d) means in regex [0-9] and inside {6} denotes that 6 time it occur
        return pinCode.matches(regex);
    }

    //Here we will check Primary Contact Person Validation
    public static boolean contactPersonValidation(String primaryContactPerson){
        if (primaryContactPerson.equals("null") || primaryContactPerson.length() > 100) {
            return false;
        }
        return true;
    }

    //Here we will check Validating RecordStatus
    public static boolean recordStatusValidation(String recordStatus) {
        if (recordStatus.equals("null") || recordStatus.length() > 1) {
            return false;
        }
        String regex = "^[NMDAR]{1}";
        return recordStatus.matches(regex);
    }

    //Here we will check Flag Validation
    public static boolean flagValidation(String flag){
        if(flag.equals("null")){
            return false;
        }
        String regex = "[AI]{1}";
        return flag.matches(regex);
    }

    //Here we will check Created Date Validation
    public static boolean createdDateValidation(String cratedDate){
        if(cratedDate.equals("null")){
            return false;
        }
        return true;
    }

    //Here we will check Created By Validation
    public static boolean createdByValidation(String createdBy){
        if(createdBy.equals("null") || createdBy.length() > 30){
            return false;
        }
        return true;
    }
}
