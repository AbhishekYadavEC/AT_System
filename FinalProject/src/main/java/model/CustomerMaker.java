package model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class CustomerMaker {

    private Long customerId;

    @Id
    @NotBlank(message = "Customer code is required")
    @Size(max = 10, message = "Customer code can't exceed 10 digits")
    private String customerCode;
    @NotBlank(message = "Customer name is required")
    @Size(max = 30, message = "Customer name can't exceed 30 characters")
    private String customerName;
    @NotBlank(message = "Customer address is required")
    @Size(max = 100, message = "Customer address can't exceed 100 characters")
    private String customerAddr1;
    @Size(max = 100, message = "Customer address can't exceed 100 characters")
    private String  customerAddr2;

    @NotNull(message = "Pin code is mandatory")
    private Integer customerPinCode;
    @NotBlank(message = "Email address is required")
    @Email(message = "Invalid email address")
    @Size(max = 100, message = "Email address can't exceed 100 characters")
    private String customerEmail;


    private long customerContactNumber;
    @NotBlank(message = "Primary contact person is required")
    @Size(max = 100, message = "Primary contact person can't exceed 100 characters")
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
    public CustomerMaker() {
    }

    public CustomerMaker(String customerCode, String customerName, String customerAddr1, String customerAddr2, Integer customerPinCode, String customerEmail, long customerContactNumber, String primaryContactPerson, String recordStatus, String activeFlag, Date createDate, String createdBy, Date modifiedDate, String modifiedBy, Date authorizedDate, String authorizedBy) {
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

    public CustomerMaker setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
        return null;
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
        return "Customer{" +
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
                ", createDate='" + createDate + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", authorizedDate='" + authorizedDate + '\'' +
                ", authorizedBy='" + authorizedBy + '\'' +
                '}';
    }
}