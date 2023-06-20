package org.example;

import java.util.Scanner;

public class IncomeTaxCalc {
    public static void incomeTaxCalculator(double income){

        double tax=0;
        if(income<=20000){
            tax=20000*0;
        }
        else if(income>20000 && income<=40000){
            tax=income-20000*0.1;
        }
        else if(income>40000 && income<=60000){
            tax=((income-40000)*0.2+20000*.1);
        }
        else{
            tax=((income-60000)*0.3+20000*0.2+20000*.1);
        }
        System.out.println("Income Tax Amount is "+tax);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Income");
        double income=sc.nextDouble();
        incomeTaxCalculator(income);
    }
}
