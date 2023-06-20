package org.example;

public class DBRCalculation {
    public static void DBRCalculation(){
        int Monthly_rent=3000;//room rent
        int Car_Loan=4000;//Car Loan
        int Credit_Card_payment=2500;// Credit Card Payment
        int Student_loan=4500; // Student Loan
        int total_debts=Car_Loan+Credit_Card_payment+Student_loan;
        int Monthly_income=30000;//Total my monthly income
        int Total_DBR=(total_debts*100)/Monthly_income;
        if(Total_DBR<=20)
            System.out.println("Loan Application Approved");
        else {
            System.out.println("Loan Application Rejected");
        }

    }
    public static void main(String[] args) {
        DBRCalculation();

    }
}
