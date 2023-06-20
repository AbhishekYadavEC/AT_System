package org.example;
import java.util.*;

public class PrincipleAndInterestCalc {
     static double interest_component;
     static double principal_component;
     public static void calculateInterestCompoenent(int principal_amount,double rate_of_interest){
         interest_component= principal_amount*(rate_of_interest/100);
         System.out.println(interest_component);
     }
     public static void calculatePrincipalComponent(int installment){
         principal_component=installment-interest_component;
         System.out.println(principal_component);
     }
     public static void main(String[] args) {
         Scanner scan =new Scanner(System.in);
         System.out.print("Enter Amount: ");
         int principal_amount=scan.nextInt();
         System.out.println("Enter Interest Rate: ");
         double rate_of_interest=scan.nextInt();
         PrincipleAndInterestCalc.calculateInterestCompoenent(principal_amount,rate_of_interest);
         int installment=scan.nextInt();
         PrincipleAndInterestCalc.calculatePrincipalComponent(installment);
     }

}
