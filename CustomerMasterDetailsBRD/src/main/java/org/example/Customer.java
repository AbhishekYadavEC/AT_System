package org.example;
/*
code is developed by Abhishek
*/
public class Customer {
    private String customerCode;
    private String customerName;
    private String customerAddress1;
    private String  customerAddress2;

    private int pinCode;
    private String emailAddress;

    private long contactNumber;
    private String primaryContactPerson;

    private String recordStatus;
    private String flag;

    private String createDate;
    private String createdBy;

    private String modifiedDate;
    private String modifiedBy;

    private String authorizedDate;
    private String authorizedBy;
    //Create constructor of customer

    public Customer(String customerCode, String customerName, String customerAddress1, int pinCode, String emailAddress, String primaryContactPerson, String recordStatus, String flag, String createDate, String createdBy) {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.customerAddress1 = customerAddress1;
        this.pinCode = pinCode;
        this.emailAddress = emailAddress;
        this.primaryContactPerson = primaryContactPerson;
        this.recordStatus = recordStatus;
        this.flag = flag;
        this.createDate = createDate;
        this.createdBy = createdBy;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress1() {
        return customerAddress1;
    }

    public String getCustomerAddress2() {
        return customerAddress2;
    }

    public int getPinCode() {
        return pinCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public String getPrimaryContactPerson() {
        return primaryContactPerson;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public String getFlag() {
        return flag;
    }

    public String getCreateDate() {
        return createDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public String getAuthorizedDate() {
        return authorizedDate;
    }

    public String getAuthorizedBy() {
        return authorizedBy;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress1(String customerAddress1) {
        this.customerAddress1 = customerAddress1;
    }

    public void setCustomerAddress2(String customerAddress2) {
        this.customerAddress2 = customerAddress2;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setPrimaryContactPerson(String primaryContactPerson) {
        this.primaryContactPerson = primaryContactPerson;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public void setAuthorizedDate(String authorizedDate) {
        this.authorizedDate = authorizedDate;
    }

    public void setAuthorizedBy(String authorizedBy) {
        this.authorizedBy = authorizedBy;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerAddress1='" + customerAddress1 + '\'' +
                ", customerAddress2='" + customerAddress2 + '\'' +
                ", pinCode=" + pinCode +
                ", emailAddress='" + emailAddress + '\'' +
                ", contactNumber=" + contactNumber +
                ", primaryContactPerson='" + primaryContactPerson + '\'' +
                ", recordStatus='" + recordStatus + '\'' +
                ", flag='" + flag + '\'' +
                ", createDate='" + createDate + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", authorizedDate='" + authorizedDate + '\'' +
                ", authorizedBy='" + authorizedBy + '\'' +
                '}';
    }
}