package org.example;

import java.util.Scanner;

public class MaxEligibleLoanAmount {
    public static void max_eligible_amt(double salary,double rate){
        //max tenure is 7 years
        int tenure=7*12;//7 years in month
        double max_eligible_emi=(salary*0.5)*((1-0.2));//50% of effective monthly salary after deducting 20% DBR
        double r = rate / 12; //effective monthly rate

        double maxEligibleLoanAmt=(max_eligible_emi * ((Math.pow(1+r,tenure))-1)) / (r * (Math.pow(1+r,tenure)));
        System.out.println("Max Eligible Loan Amount: "+ maxEligibleLoanAmt);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Enter Monthly Salary
        System.out.print("Enter Your Monthly Salary: ");
        double salary=sc.nextDouble();
        //Enter effective monthly salary rate
        System.out.print("Enter the effective monthly rate: ");
        double rate=sc.nextDouble();
        max_eligible_amt(salary,rate);

    }
}
