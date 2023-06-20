package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class CustomerChecker {

    private Long customerId;

    @Id
    private String customerCode;
    private String customerName;

    private String customerAddr1;

    private String  customerAddr2;

    private Integer customerPinCode;

    private String customerEmail;


    private long customerContactNumber;

    private String primaryContactPerson;

    private String recordStatus;

    private String activeFlag;

    private Date createDate;

    private String createdBy;

    private Date modifiedDate;


    private String modifiedBy;

    private Date authorizedDate;


    private String authorizedBy;

    //Create constructor of customer
    public CustomerChecker() {
    }

    public CustomerChecker(String customerCode, String customerName, String customerAddr1, String customerAddr2, Integer customerPinCode, String customerEmail, long customerContactNumber, String primaryContactPerson, String recordStatus, String activeFlag, Date createDate, String createdBy, Date modifiedDate, String modifiedBy, Date authorizedDate, String authorizedBy) {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.customerAddr1 = customerAddr1;
        this.customerAddr2 = customerAddr2;
        this.customerPinCode = customerPinCode;
        this.customerEmail = customerEmail;
        this.customerContactNumber = customerContactNumber;
        this.primaryContactPerson = primaryContactPerson;
        this.recordStatus = recordStatus;
        this.activeFlag = activeFlag;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.modifiedDate = modifiedDate;
        this.modifiedBy = modifiedBy;
        this.authorizedDate = authorizedDate;
        this.authorizedBy = authorizedBy;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddr1() {
        return customerAddr1;
    }

    public void setCustomerAddr1(String customerAddr1) {
        this.customerAddr1 = customerAddr1;
    }

    public String getCustomerAddr2() {
        return customerAddr2;
    }

    public void setCustomerAddr2(String customerAddr2) {
        this.customerAddr2 = customerAddr2;
    }

    public Integer getCustomerPinCode() {
        return customerPinCode;
    }

    public void setCustomerPinCode(Integer customerPinCode) {
        this.customerPinCode = customerPinCode;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public long getCustomerContactNumber() {
        return customerContactNumber;
    }

    public void setCustomerContactNumber(long customerContactNumber) {
        this.customerContactNumber = customerContactNumber;
    }

    public String getPrimaryContactPerson() {
        return primaryContactPerson;
    }

    public void setPrimaryContactPerson(String primaryContactPerson) {
        this.primaryContactPerson = primaryContactPerson;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    public String getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(String activeFlag) {
        this.activeFlag = activeFlag;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getAuthorizedDate() {
        return authorizedDate;
    }

    public void setAuthorizedDate(Date authorizedDate) {
        this.authorizedDate = authorizedDate;
    }

    public String getAuthorizedBy() {
        return authorizedBy;
    }

    public void setAuthorizedBy(String authorizedBy) {
        this.authorizedBy = authorizedBy;
    }

    @Override
    public String toString() {
        return "CustomerMaster{" +
                "customerId=" + customerId +
                ", customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerAddr1='" + customerAddr1 + '\'' +
                ", customerAddr2='" + customerAddr2 + '\'' +
                ", customerPinCode=" + customerPinCode +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerContactNumber=" + customerContactNumber +
                ", primaryContactPerson='" + primaryContactPerson + '\'' +
                ", recordStatus='" + recordStatus + '\'' +
                ", activeFlag='" + activeFlag + '\'' +
                ", createDate=" + createDate +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedDate=" + modifiedDate +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", authorizedDate=" + authorizedDate +
                ", authorizedBy='" + authorizedBy + '\'' +
                '}';
    }
}
