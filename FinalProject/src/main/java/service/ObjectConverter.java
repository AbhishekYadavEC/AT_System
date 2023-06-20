package service;

import model.CustomerChecker;
import model.CustomerMaker;

public class ObjectConverter {
    public static CustomerMaker convertIntoMaker(CustomerChecker customerChecker){
        if(customerChecker == null)
            return null;
        CustomerMaker customerMaker = new CustomerMaker();
        customerMaker.setCustomerCode(customerChecker.getCustomerCode());
        customerMaker.setCustomerName(customerChecker.getCustomerName());
        customerMaker.setCustomerAddr1(customerChecker.getCustomerAddr1());
        customerMaker.setCustomerAddr2(customerChecker.getCustomerAddr2());
        customerMaker.setCustomerPinCode(customerChecker.getCustomerPinCode());
        customerMaker.setCustomerEmail (customerChecker.getCustomerEmail ());
        customerMaker.setCustomerContactNumber (customerChecker.getCustomerContactNumber ());
        customerMaker.setPrimaryContactPerson(customerChecker.getPrimaryContactPerson());
        customerMaker.setRecordStatus(customerChecker.getRecordStatus());
        customerMaker.setActiveFlag (customerChecker.getActiveFlag ());
        customerMaker.setCreatedBy(customerChecker.getCreatedBy());
        customerMaker.setCreateDate(customerChecker.getCreateDate());
        customerMaker.setAuthorizedBy(customerChecker.getAuthorizedBy());
        customerMaker.setAuthorizedDate(customerChecker.getAuthorizedDate());
        customerMaker.setModifiedBy(customerChecker.getModifiedBy());
        customerMaker.setModifiedDate(customerChecker.getModifiedDate());

        return customerMaker;
    }
    public static CustomerChecker convertIntoChecker(CustomerMaker customerMaker){
        if(customerMaker == null)
            return null;
        CustomerChecker customerChecker=new CustomerChecker (  );
        customerChecker.setCustomerCode(customerMaker.getCustomerCode());
        customerChecker.setCustomerName(customerMaker.getCustomerName());
        customerChecker.setCustomerAddr1(customerMaker.getCustomerAddr1());
        customerChecker.setCustomerAddr2(customerMaker.getCustomerAddr2());
        customerChecker.setCustomerPinCode(customerMaker.getCustomerPinCode());
        customerChecker.setCustomerEmail (customerMaker.getCustomerEmail ());
        customerChecker.setCustomerContactNumber (customerMaker.getCustomerContactNumber ());
        customerChecker.setPrimaryContactPerson(customerMaker.getPrimaryContactPerson());
        customerChecker.setRecordStatus(customerMaker.getRecordStatus());
        customerChecker.setActiveFlag (customerMaker.getActiveFlag ());
        customerChecker.setCreatedBy(customerMaker.getCreatedBy());
        customerChecker.setCreateDate(customerMaker.getCreateDate());
        customerChecker.setAuthorizedBy(customerMaker.getAuthorizedBy());
        customerChecker.setAuthorizedDate(customerMaker.getAuthorizedDate());
        customerChecker.setModifiedBy(customerMaker.getModifiedBy());
        customerChecker.setModifiedDate(customerMaker.getModifiedDate());
        return customerChecker;
    }
}