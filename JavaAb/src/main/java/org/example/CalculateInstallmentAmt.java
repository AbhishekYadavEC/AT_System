package org.example;

import java.util.Scanner;

public class CalculateInstallmentAmt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Enter loan amount
        System.out.print("Enter Loan Amount: ");
        double loan_amount=sc.nextDouble();
        //Enter interest rate
        System.out.print("Interest Rate: ");
        double interest_rate=sc.nextDouble();
        //Enter loan term in month
        System.out.print("Enter loan term in month: ");
        int loan_term=sc.nextInt();
        double interest = loan_amount * (interest_rate/100)*(loan_term/12);
        double total_amount=loan_amount+interest;
        double monthly_install=total_amount/loan_term;
        System.out.println("Monthly Installment: " + monthly_install);
    }
}
