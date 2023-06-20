package driver;


import model.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HRApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fileNames = {"seema.txt", "raj.txt", "anuj.txt", "sapan.txt"};
        List<Employee> employees = new ArrayList<>();

        // Loop through each file in the array of file names
        for (String fileName : fileNames) {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line = br.readLine();
                String[] parts = line.split(",");
                String name = parts[0];
                String email = parts[1];
                String qualification = parts[2];
                int yearOfExperience = Integer.parseInt(parts[3]);
                String dateOfBirth = parts[4];


                // Create a new Employee object with the data read from the file
                Employee employee = new Employee(name, email, qualification, yearOfExperience, dateOfBirth);
                String designation = "";

                // Determine the employee's designation based on their years of experience and qualification
                if (yearOfExperience >= 0 && yearOfExperience <= 1 && qualification.equals("B.Tech")) {
                    designation = "ASE";
                } else if (yearOfExperience > 1 && yearOfExperience <= 3 && (qualification.equals("B.Tech") || qualification.equals("MCA"))) {
                    designation = "SE";
                } else if (yearOfExperience > 3 && yearOfExperience <= 5 && qualification.equals("MCA")) {
                    designation = "TL";
                } else if (yearOfExperience > 5 && (qualification.equals("B.Tech") || qualification.equals("MCA"))) {
                    designation = "Project Manager";
                }

                // Set the employee's designation and add the employee to the list of employees
                employee.setDesignation(designation);
                employees.add(employee);

            } catch (IOException e) {
                // Handle any exceptions that occur while reading the file
                System.out.println("Error reading file: " + e.getMessage());
            } catch (NumberFormatException e) {
                // Handle the case where the year of experience is not a valid integer
                System.out.println("Invalid number: " + e.getMessage());
            } /*catch (DetailsNotAvailableException e) {
                // Handle the case where the file for the given employee name is not found
                System.out.println("Details not available for " + e.getMessage());
            }*/
        }

        try (FileWriter writer = new FileWriter("employee_details.txt")) {
            for (Employee employee : employees) {
                // Write each employee's details to a new line in the output file
                writer.write(employee.toString() + "\n");
            }
            System.out.println("Employee details saved to employee_details.txt");
        } catch (IOException e) {
            // Handle any exceptions that occur while writing to the output file
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}