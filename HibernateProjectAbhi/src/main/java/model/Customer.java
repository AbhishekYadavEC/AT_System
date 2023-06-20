package model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
@Entity
@Table(name = "customer16915")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id")
    private int custId;

    @Column(name = "name")
    private String name;

    @Column(name = "dob")
    private LocalDate dob;

    @ElementCollection
    @CollectionTable(name = "customer_phone_number", joinColumns = @JoinColumn(name = "cust_id"))
    @Column(name = "phone_number")
    private List<String> phoneNumbers;

    @ElementCollection
    @CollectionTable(name = "customer_email_address", joinColumns = @JoinColumn(name = "cust_id"))
    @Column(name = "email_address")
    private Set<String> emailAddressSet;

    @OneToOne(fetch = FetchType.EAGER)
  //  @JoinColumn(name = "address_id")
    private Address address;

    @Column(name = "monthly_income")
    private double monthlyIncome;

    @Column(name = "profession")
    private String profession;

    @Column(name = "designation")
    private String designation;

    @Column(name = "company_name")
    private String companyName;

    public Customer() {
    }

    public Customer(String name, LocalDate dob, List<String> phoneNumbers, Set<String> emailAddressSet, Address address, double monthlyIncome, String profession, String designation, String companyName) {
        this.name = name;
        this.dob = dob;
        this.phoneNumbers = phoneNumbers;
        this.emailAddressSet = emailAddressSet;
        this.address = address;
        this.monthlyIncome = monthlyIncome;
        this.profession = profession;
        this.designation = designation;
        this.companyName = companyName;
    }
    // getters and setters

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Set<String> getEmailAddressSet() {
        return emailAddressSet;
    }

    public void setEmailAddressSet(Set<String> emailAddressSet) {
        this.emailAddressSet = emailAddressSet;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", phoneNumbers=" + phoneNumbers +
                ", emailAddressSet=" + emailAddressSet +
                ", address=" + address +
                ", monthlyIncome=" + monthlyIncome +
                ", profession='" + profession + '\'' +
                ", designation='" + designation + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}

