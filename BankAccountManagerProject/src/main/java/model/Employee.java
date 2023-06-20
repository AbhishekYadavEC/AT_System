package model;

public class Employee {
    private String name;
    private String email;
    private String qualification;
    private int yearOfExperience;
    private String dateOfBirth;
    private String designation;

    public Employee(String name, String email, String qualification, int yearOfExperience, String dateOfBirth) {
        this.name = name;
        this.email = email;
        this.qualification = qualification;
        this.yearOfExperience = yearOfExperience;
        this.dateOfBirth = dateOfBirth;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", qualification='" + qualification + '\'' +
                ", yearOfExperience=" + yearOfExperience +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
