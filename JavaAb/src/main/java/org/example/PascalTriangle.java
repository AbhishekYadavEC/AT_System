package org.example;
import java.util.*;
public class PascalTriangle {
    public static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int n=4,i,j;
        for(i=0;i<=n;i++){
            for(j=0;j<=n-i;j++){
                //for left spacing
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print(" "+ factorial(i)/(factorial(i-j) * factorial(j)));
            }
            System.out.println();
        }
    }
}
