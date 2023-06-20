package org.example;
import java.util.*;
public class LTV_Calculation {
    public static void LTV_Calculation(){
        Scanner sc= new Scanner(System.in);
        float loan_amount=sc.nextInt();
        float property_value=sc.nextInt();
        float total_ltv=(loan_amount/property_value)*100;
        if(total_ltv<=80)
            System.out.println("You will give Lowest Interest Rate on LTV ratio " +total_ltv);
        else
            System.out.println("Your interest charge will be increase on LTV ratio " +total_ltv);
    }
    public static void main(String[] args) {

        LTV_Calculation();
    }
}
